package com.iptton.wedroid;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView wv = (WebView)findViewById(R.id.webView);
        wv.loadUrl("file:///android_asset/settings.html");
    }
}
