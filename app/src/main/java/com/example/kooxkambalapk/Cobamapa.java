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

public class Cobamapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cobubi);


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
        webView.loadUrl("https://www.google.com/maps/place/Zona+Arqueol%C3%B3gica+Cob%C3%A1/@20.490463,-87.7300974,17z/data=!3m1!4b1!4m5!3m4!1s0x8f51cf9d39d9283d:0x79546c8ca52e8f0b!8m2!3d20.490463!4d-87.7279087");
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
