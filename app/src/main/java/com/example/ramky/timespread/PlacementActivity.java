package com.example.ramky.timespread;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PlacementActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
        Login l = new Login();
        TextView textView = (TextView)hView.findViewById(R.id.textview);
        TextView textView1 = (TextView)hView.findViewById(R.id.textview1);
        TextView textView2 = (TextView)hView.findViewById(R.id.textview2);
        textView1.setText(Login.u.getFullName());
       textView.setText(l.badge(Login.u.getFullName()));

        assert v !=null;
        v.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(PlacementActivity.this, ProfileActivity.class));


            }



        });



        recyclerView = (RecyclerView) findViewById(R.id.recycler_Placement);
        /*adapter = new BusAdapter(getActivity().getApplicationContext());*/

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
       /* recyclerView.setAdapter(adapter);*/

        List<timetable_p> busses;

        int i;
        Placements p1 = l.getP();

        busses = new ArrayList<>();

        for(i=0;i<p1.getPlacementData().size();i++) {

            busses.add(new timetable_p(p1.getPlacementData().get(i).getCompanyName(),p1.getPlacementData().get(i).getJobDescription(),p1.getPlacementData().get(i).getPointerCriteria(),p1.getPlacementData().get(i).getPlacementPackage()));
        }


        PlacementAdapter adapter = new PlacementAdapter(busses);
        recyclerView.setAdapter(adapter);



         /*adapter = new BusAdapter(busses);*/


        recyclerView.setLayoutManager(linearLayoutManager);



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
            startActivity(new Intent(PlacementActivity.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(PlacementActivity.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(PlacementActivity.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(PlacementActivity.this,BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(PlacementActivity.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(PlacementActivity.this,PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(PlacementActivity.this,EventsActivity.class));
        } else if (id == R.id.logout) {
            Intent i=new Intent(PlacementActivity.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
