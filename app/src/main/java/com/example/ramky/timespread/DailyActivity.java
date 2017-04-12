package com.example.ramky.timespread;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.name;

public class DailyActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Login l = new Login();







        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        View hView =  navigationView.getHeaderView(0);
        TextView v = (TextView)hView.findViewById(R.id.viewprofile);

        TextView textView = (TextView)hView.findViewById(R.id.textview);
        TextView textView1 = (TextView)hView.findViewById(R.id.textview1);
        TextView textView2 = (TextView)hView.findViewById(R.id.textview2);
        textView1.setText(Login.u.getFullName());
        textView.setText(l.badge(Login.u.getFullName()));

        assert v !=null;
        v.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(DailyActivity.this, ProfileActivity.class));


            }



        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fifth, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mess_N) {
            startActivity(new Intent(DailyActivity.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(DailyActivity.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(DailyActivity.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(DailyActivity.this, BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(DailyActivity.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(DailyActivity.this, PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(DailyActivity.this, EventsActivity.class));
        }else if (id == R.id.logout) {
            Intent i=new Intent(DailyActivity.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
