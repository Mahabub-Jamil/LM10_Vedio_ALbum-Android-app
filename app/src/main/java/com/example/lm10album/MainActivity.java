package com.example.lm10album;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout player1, player2, player3, player4, player5;
    WebView webView;
    ImageView imageViewCover;
    String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        player3 = findViewById(R.id.player3);
        player4 = findViewById(R.id.player4);
        player5 = findViewById(R.id.player5);
        webView = findViewById(R.id.webViewPlayer);
        imageViewCover = findViewById(R.id.imageViewCover);

        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link="https://www.youtube.com/embed/It4YOYzEaVY";
                imageViewCover.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(link);
//                Intent intent = new Intent(MainActivity.this, VedioPlayer.class);
//                startActivity(intent);
            }
        });

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link="https://www.youtube.com/embed/VjxHESHabBI";
                imageViewCover.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(link);
//                Intent intent = new Intent(MainActivity.this, VedioPlayer.class);
//                startActivity(intent);
            }
        });

        player3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link="https://www.youtube.com/embed/nVbB3C_hs5g";
                imageViewCover.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(link);
//                Intent intent = new Intent(MainActivity.this, VedioPlayer.class);
//                startActivity(intent);

            }
        });

        player4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link="https://www.youtube.com/embed/nPsz2ggTAkk";
                imageViewCover.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(link);
//                Intent intent = new Intent(MainActivity.this, VedioPlayer.class);
//                startActivity(intent);

            }
        });

        player5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link="https://www.youtube.com/embed/jqlxti9oYzw";
                imageViewCover.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(link);
//                Intent intent = new Intent(MainActivity.this, VedioPlayer.class);
//                startActivity(intent);
            }
        });



    }
}