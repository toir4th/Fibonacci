package com.erkki.fibonacci;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GetWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_wiki);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        WebView myWebView = (WebView) findViewById(R.id.webView);

        if (Build.VERSION.SDK_INT >= 8) {
            myWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }

        myWebView.loadUrl("https://en.wikipedia.org/wiki/Fibonacci_number");
    }



}
