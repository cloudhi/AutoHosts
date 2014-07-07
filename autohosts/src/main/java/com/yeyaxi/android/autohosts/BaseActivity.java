package com.yeyaxi.android.autohosts;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by allen on 07/07/14.
 * Thanks for Kelvin Pan (https://plus.google.com/u/0/114175506136437522681) providing the hosts
 * I am authorised to use this hosts.
 */
public class BaseActivity extends SherlockActivity {

//    public static final String hosts = "https://kelvin-mirex-svn.googlecode.com/svn/trunk/ipv4-hosts/hosts";
//    public static final String svn = "https://kelvin-mirex-svn.googlecode.com/svn/trunk/ipv4-hosts/";
    public static final String PROJECTH = "https://www.projecth.us/sources/9/25/hosts";
    public static final String TIMESTAMP_PREFIX = "#+UPDATE_TIME";
    public static final String LOG_NAME = "AutoHosts";
    public static final String MY_AD_UNIT_ID = "a14eba45f4f4154";
    public static int APPEND_ITEM_REQUEST_CODE = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTranslucentStatus(true);
    }

    public static void setFont(TextView textView) {
        Typeface tf = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/OCRAStd.otf");
        textView.setTypeface(tf);
    }

    @TargetApi(19)
    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        final int bits2 = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
        if (on) {
            winParams.flags |= bits;
            winParams.flags |= bits2;
        } else {
            winParams.flags &= ~bits;
            winParams.flags &= ~bits2;
        }
        win.setAttributes(winParams);
    }

}
