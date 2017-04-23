package co.tagtalk.winemate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicLong;
import co.tagtalk.winemate.thriftfiles.CountryId;
import co.tagtalk.winemate.thriftfiles.NewsFeedRequest;
import co.tagtalk.winemate.thriftfiles.NewsFeedResponse;
import co.tagtalk.winemate.thriftfiles.WineMateServices;

public class Tester extends AppCompatActivity {
    private final AtomicLong counter = new AtomicLong();
    private final int MAX_THREAD = 1000;
    private Button startButton;
    private Button clearButton;
    private EditText numberOfUser;
    private TextView testResult;
    private int numOfThreads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);
        startButton = (Button) findViewById(R.id.start_button);
        clearButton = (Button) findViewById(R.id.clear_button);
        numberOfUser = (EditText) findViewById(R.id.number_of_user);
        testResult = (TextView) findViewById(R.id.test_result);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.set(0);
                startButton.setEnabled(false);
                testResult.append("======================\n");
                numOfThreads = Math.min(
                        numberOfUser.getText().toString().isEmpty() ?
                                0 : Integer.valueOf(numberOfUser.getText().toString()),
                        MAX_THREAD);
                final CyclicBarrier gate = new CyclicBarrier(numOfThreads + 1);
                for(int i = 0; i < numOfThreads; i++){
                    final int thread_idx = i;
                    new Thread(String.valueOf(i)){
                        public void run(){
                            try {
                                gate.await();
                            } catch(Exception e) {
                                testResult.append("Got exception on await() for thread " + Integer.toString(thread_idx) + "!\n");
                            }
                            //Log.v("Tester", "Thread " + getName() + " running...");
                            getMyNewsFeed(this);
                        }
                    }.start();
                }

                try {
                    gate.await();
                } catch(Exception e) {
                    testResult.append("Got exception on await() in main thread!");
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testResult.setText("");
                startButton.setEnabled(true);
            }
        });
    }

    private NewsFeedResponse getMyNewsFeed(Thread thread) {
        NewsFeedResponse response = new NewsFeedResponse();
        NewsFeedRequest request = new NewsFeedRequest(1, CountryId.CHINESE);
        TTransport transport = new TSocket(Configs.SERVER_ADDRESS, Configs.PORT_NUMBER);
        try {
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            WineMateServices.Client client = new WineMateServices.Client(protocol);
            //Log.v("Tester", "Thread " + thread.getName() + " request...");
            final Long start = System.currentTimeMillis();
            response = client.getMyNewsFeed(request);
            final Long end = System.currentTimeMillis();
            //Log.v("Tester", "Thread " + thread.getName() + " done - " + String.valueOf((end - start)) + " milliseconds.");
            final String threadName = thread.getName();
            Tester.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    long count = counter.incrementAndGet();
                    if (count == numOfThreads) {
                        startButton.setEnabled(true);
                    }
                    testResult.append("Thread " + threadName + " spent " + String.valueOf((end - start)) + " ms. Count: " + counter.get() + "\n");
                }
            });
        } catch (TException x) {
            Log.v("Tester", "Thread " + thread.getName() + " TException!");
            final String threadName = thread.getName();
            Tester.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    long count = counter.incrementAndGet();
                    if (count == numOfThreads) {
                        startButton.setEnabled(true);
                    }
                    testResult.append("!!!!! Thread " + threadName + " remote call failed! " + "Count: " + counter.get() + "\n");
                }
            });
            // x.printStackTrace();
        }
        transport.close();
        //Log.v("Tester", "Thread " + thread.getName() + " request ok. size = " + response.response.size());
        return response;
    }
}
