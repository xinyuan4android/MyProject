package com.iningke.ziruibao;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private final String webUrl = "http://121.42.199.76:9002/";//要加载的网址

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        aboutWebView();
    }

    private void initView() {
        webView = (WebView) findViewById(R.id.main_webView);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void aboutWebView() {
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.setHorizontalScrollBarEnabled(false);//滚动条水平不显示
        webView.setVerticalScrollBarEnabled(false); //滚动条垂直不显示
        webView.loadUrl(webUrl);
    }


}
