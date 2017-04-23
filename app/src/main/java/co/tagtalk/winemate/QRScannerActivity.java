package co.tagtalk.winemate;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;

import co.tagtalk.winemate.thriftfiles.TagInfo;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.view.View.GONE;
import static co.tagtalk.winemate.Constants.PERMISSIONS_REQUEST_CAMERA;

public class QRScannerActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private HeaderBar headerBar;
    private Integer wineId;
    private Integer userId;
    private Integer rewardPoint;
    private String tagId;
    private TagInfo tagInfo;

    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Setup header title and back button.
        TextView headerBarTitle = (TextView) findViewById(R.id.intro_nfc_authentication_activity_title);
        headerBarTitle.setText(R.string.qrscanner_activity_title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent= getIntent();
        wineId = intent.getIntExtra("wineId", 0);
        userId    = intent.getIntExtra("userId", 0);
        rewardPoint = intent.getIntExtra("rewardPoint", 0);

        tagId     = intent.getStringExtra("tagId");
        tagInfo   = (TagInfo)intent.getSerializableExtra("tagInfo");

        TextView descBtn = (TextView) findViewById(R.id.qrscanner_check_steps_btn);
        descBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQRScanDesc = new Intent();
                intentQRScanDesc.setClassName("co.tagtalk.winemate",
                        "co.tagtalk.winemate.QRScanDescActivity");
                intentQRScanDesc.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentQRScanDesc);
            }
        });

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            scanQRCode();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PERMISSIONS_REQUEST_CAMERA);
        }
    }

    // This should be the same for all activity that show back button.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == PERMISSIONS_REQUEST_CAMERA) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                scanQRCode();
            } else {
                Toast.makeText(this, R.string.qrscanner_activity_camera_request, Toast.LENGTH_LONG).show();
                finish();
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (mScannerView != null) {
            mScannerView.stopCamera();
        }
    }

    private void scanQRCode() {
        mScannerView = (ZXingScannerView) findViewById(R.id.qrscanner_scanner_view);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void handleResult(Result result) {

        String bottleOpenIdentifier = result.getText();

        Intent intent = new Intent();
        intent.putExtra("wineId", wineId);
        intent.putExtra("tagId", tagId);
        intent.putExtra("userId", userId);
        intent.putExtra("rewardPoint", rewardPoint);
        intent.putExtra("bottleOpenIdentifier", bottleOpenIdentifier);
        intent.setClassName("co.tagtalk.winemate",
                "co.tagtalk.winemate.AddToMyBottlesActivity");
        startActivity(intent);
        mScannerView.stopCamera();
        finish();
    }
}
