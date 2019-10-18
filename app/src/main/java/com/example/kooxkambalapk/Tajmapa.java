package com.example.kooxkambalapk;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tajmapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tajubi);


        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {

        } else {
            Toast.makeText(getApplicationContext(), "SIN CONEXIÓN A INTERNET", Toast.LENGTH_LONG).show();

            Intent i = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage( getBaseContext().getPackageName() );
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);


        }
        WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com/maps/search/ruinas+del+tajin/@20.3475892,-97.6379382,11.05z");
        /*https://www.youtube.com/watch?v=9yc4JIMcZQg*/
        /* https://www.youtube.com/watch?v=rv3k9mGTRvo*/
        /*https://www.youtube.com/watch?v=rPEtl3soplU Religión maya*/
        webView.setWebViewClient((new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //Al dar clic en un link se obligará a cargar dentro del WebView.
                view.loadUrl(url);
                return true;
            }
        }));
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.transition.dos, R.transition.uno);
    }



}
