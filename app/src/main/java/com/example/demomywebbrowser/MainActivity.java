package com.example.demomywebbrowser;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wvMyPage = findViewById(R.id.webViewMyPage);
        btnLoadURL = findViewById(R.id.buttonLoad);
        etURL = findViewById(R.id.etURL);
        wvMyPage.setWebViewClient(new WebViewClient());
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setBuiltInZoomControls(true);
                etURL.setVisibility(View.GONE);
            }
        });
    }
}
