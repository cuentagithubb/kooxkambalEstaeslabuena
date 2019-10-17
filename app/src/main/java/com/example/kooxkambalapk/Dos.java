package com.example.kooxkambalapk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Dos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        CardView cardView;
        CardView cardViewdos;
        CardView cardViewtres;
        CardView cardViewcuatro;
        CardView cardViewcinco;
        CardView cardViewseis;
        CardView cardViewsiete;
        CardView cardViewocho;
        CardView cardViewnueve;
        CardView cardViewdiez;


        cardView = findViewById(R.id.mapasabrirrr);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaUno.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardViewdos = findViewById(R.id.mapastres);
        cardViewdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaDos.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardViewtres= findViewById(R.id.mapacinco);
        cardViewtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaTres.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardViewcuatro= findViewById(R.id.mapaseis);
        cardViewcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaCuatro.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });
        cardViewcinco= findViewById(R.id.mapasiete);
        cardViewcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaCinco.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardViewseis= findViewById(R.id.mapaochos);
        cardViewseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaSeis.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardViewsiete= findViewById(R.id.mapadiez);
        cardViewsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaSiete.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });
        cardViewocho= findViewById(R.id.mapaochoss);
        cardViewocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaOcho.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });
        cardViewnueve= findViewById(R.id.mapanueve);
        cardViewnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaNueve.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });
        cardViewdiez= findViewById(R.id.mapadiezz);
        cardViewdiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dos.this, MapaDiez.class);
                startActivity(a);overridePendingTransition(R.transition.dos, R.transition.uno);


            }


        });



    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.transition.dos, R.transition.uno);
    }



}