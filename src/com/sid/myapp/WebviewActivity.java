package com.sid.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        WebView myWebView = (WebView) findViewById(R.id.web);
        if (myWebView!=null) {
            myWebView.loadUrl("http://www.amazon.com");
        }
    }
}