package com.example.blesolution;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private CardView bankCard,ideasCard,addCard,linksCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ideasCard=(CardView) findViewById(R.id.ideas_card) ;
        bankCard=(CardView) findViewById(R.id.bank_card) ;
        addCard=(CardView) findViewById(R.id.add_card) ;
        linksCard=(CardView) findViewById(R.id.links_card) ;
        bankCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bankCardd= new Intent(MainActivity.this, scienceOne.class);
                startActivity(bankCardd);
            }
        });



        ideasCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ideasCardd= new Intent(MainActivity.this, cmathOne.class);
                startActivity(ideasCardd);
            }
        });

        addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addCardd= new Intent(MainActivity.this, omathOne.class);
                startActivity(addCardd);
            }
        });
        linksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkCardd= new Intent(MainActivity.this, gamesOne.class);
                startActivity(linkCardd);
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_send) {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/poudel_sgr/"));
            startActivity(browserIntent);

        } else if (id == R.id.nav_share) {
            Intent shareIntent=new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT,"");
            shareIntent.setType("text/plain");
            startActivity(Intent.createChooser(shareIntent,"SHARE VIA"));


        } else if (id == R.id.class_nine) {

        } else if (id == R.id.see_solution) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
