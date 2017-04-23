package co.tagtalk.winemate;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import co.tagtalk.winemate.thriftfiles.MyBottlesRequest;
import co.tagtalk.winemate.thriftfiles.MyProfile;
import co.tagtalk.winemate.thriftfiles.ThirdParty;
import co.tagtalk.winemate.thriftfiles.User;
import co.tagtalk.winemate.thriftfiles.WineMateServices;

import static android.view.View.GONE;

public class Utilities {
    public static final String ROOT = "fonts/";
    public static final String FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    /**
     * Set a textView to use fontawesome.
     * Usage: textView.setTypeface(Utilities.getTypeface(Utilities.FONTAWESOME));
     */
    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

    /*
     * Just to save 2 lines of code, no need to wrap with Configs.DEBUG_MODE.
     */
    public static void logV(String title, String msg) {
        if (Configs.DEBUG_MODE) {
            Log.v(title, msg);
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    // User Util
    ///////////////////////////////////////////////////////////////////////////////////
    /**
     * It will try to get User object from preference first, if not there, then make remote call.
     * We should always use this function to avoid unnecessary remote call.
     */
    public static boolean putUserToSharedPrefs(User user, SharedPreferences sharedPrefs) {
        sharedPrefs.edit().putString(Configs.USER_NAME, user.getUserName()).apply();
        sharedPrefs.edit().putString(Configs.EMAIL, user.getEmail()).apply();
        sharedPrefs.edit().putString(Configs.PASSWORD, user.getPassword()).apply();
        sharedPrefs.edit().putString(Configs.LAST_NAME, user.getLastName()).apply();
        sharedPrefs.edit().putString(Configs.FIRST_NAME, user.getFirstName()).apply();
        sharedPrefs.edit().putString(Configs.SEX, user.getSex()).apply();
        sharedPrefs.edit().putInt(Configs.REWARD_POINTS, user.getRewardPoints()).apply();
        sharedPrefs.edit().putString(Configs.PHOTO_URL, user.getPhotoUrl()).apply();
        String thirdParty = "NONE";
        if (user.getThirdParty() == ThirdParty.WECHAT) {
            thirdParty = "WECHAT";
        }
        sharedPrefs.edit().putString(Configs.THIRD_PARTY, thirdParty).apply();

        // Mark USER_IN_SHARED_PREFS as true.
        sharedPrefs.edit().putBoolean(Configs.HAS_USER_IN_SHARED_PREFS, true).apply();
        return true;
    }
}
