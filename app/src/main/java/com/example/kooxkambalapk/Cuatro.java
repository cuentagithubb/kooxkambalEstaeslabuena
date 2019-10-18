package com.example.kooxkambalapk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Cuatro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        CardView cardVieww;
        CardView cardView2;
        CardView cardView3;
        CardView cardView4;
        CardView cardView5;
        CardView cardView6;
        CardView cardView7;
        CardView cardView8;
        CardView cardView9;
        CardView cardView10;
        CardView cardView11;
        CardView cardView12;


        cardVieww = findViewById(R.id.videouno);
        cardVieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, VideoUno.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });

        cardView2 = findViewById(R.id.mapastres);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, VideoDos.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView3 = findViewById(R.id.mapacinco);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, VideoTres.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView4 = findViewById(R.id.mapaseis);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Cuatro.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView5 = findViewById(R.id.mapasiete);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Cinco.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView6 = findViewById(R.id.mapaochos);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Seis.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView7 = findViewById(R.id.mapadiez);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Siete.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView8 = findViewById(R.id.mapaochos);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Ocho.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView9 = findViewById(R.id.mapanueve);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Nueve.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
       /* cardView10 = findViewById(R.id.mapadiez);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Diez.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        /*
        cardView11 = findViewById(R.id.videoonce);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Once.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView12 = findViewById(R.id.videodoce);
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Doce.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
*/
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.transition.dos, R.transition.uno);
    }



}