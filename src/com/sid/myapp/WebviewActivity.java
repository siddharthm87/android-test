package com.sid.myapp;

import android.app.Activity;
import android.view.View;
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
        myWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        myWebView.loadUrl("www.amazon.com");
    }
}