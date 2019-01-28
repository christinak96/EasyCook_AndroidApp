package com.example.christinakouti.easycook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.webview_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent webviewIntent = new Intent(this, HomeActivity.class);
            startActivity(webviewIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void Argiro(View view) {
        //load needed url in webview
        WebView browser = (WebView) findViewById(R.id.WebView);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("http://www.argiro.gr");
    }


    public void Akispetretzikis(View view) {
        //load needed url in webview
        WebView browser = (WebView) findViewById(R.id.WebView);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("http://www.akispetretzikis.com");
    }
}