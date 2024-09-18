package com.example.lm10album;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VedioPlayer extends AppCompatActivity {

    WebView webView;
//    public static String link ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vedio_player);

//        webView = findViewById(R.id.webViewPlayer);
//
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(link);
    }
}