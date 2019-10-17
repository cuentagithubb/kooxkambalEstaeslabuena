package com.example.kooxkambalapk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        CardView cardView;
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

        cardView = findViewById(R.id.carduno);
        cardView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Uno.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }


        });

        cardView2 = findViewById(R.id.carddos);
        cardView2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Dos.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView3 = findViewById(R.id.cardtres);
        cardView3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Tres.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView4 = findViewById(R.id.cardcuatro);
        cardView4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Cuatro.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView5 = findViewById(R.id.cardcinco);
        cardView5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Cinco.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView6 = findViewById(R.id.cardseis);
        cardView6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Seis.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
     cardView7 = findViewById(R.id.cardsiete);
        cardView7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Siete.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView8 = findViewById(R.id.cardsietes);
        cardView8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Ocho.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        /*
        cardView9 = findViewById(R.id.cardocho);
        cardView9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Nueve.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView10 = findViewById(R.id.cardnueve);
        cardView10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Diez.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView11 = findViewById(R.id.carddiez);
        cardView11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Once.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });
        cardView12 = findViewById(R.id.cardonce);
        cardView12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Doce.class);
                startActivity(a);
                overridePendingTransition(R.transition.dos, R.transition.uno);

            }
        });

*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {

            if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {

                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Salir")
                        .setMessage("Estás seguro?")
                        .setNegativeButton(android.R.string.cancel, null)// sin listener
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {// un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
// Salir
                                MainActivity.this.finish();
                            }
                        })
                        .show();

// Si el listener devuelve true, significa que el evento esta procesado, y nadie debe hacer nada mas
                return true;
            }
// para las demas cosas, se reenvia el evento al listener habitual
            return super.onKeyDown(keyCode, event);


    }


    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}