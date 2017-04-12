package com.example.ramky.timespread;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

import static com.example.ramky.timespread.R.layout.nav_header_fifth;


public class FifthActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button mess_C;
    Button bus_C;
    Button event_c;
    Button class_C;
    TextView viewprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
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
        Login l = new Login();

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
                startActivity(new Intent(FifthActivity.this, ProfileActivity.class));


            }



        });

        //Placement Button
        Button placement_C = (Button) findViewById(R.id.placement_C) ;
        assert placement_C != null;
        placement_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, PlacementActivity.class));


            }



        });
        //Daily  Button
        Button daily_C = (Button) findViewById(R.id.daily_C) ;
        assert daily_C != null;
        daily_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, DailyActivity.class));


            }



        });

        //events Button
        Button events_C = (Button) findViewById(R.id.events_C) ;
        assert events_C != null;
        events_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, EventsActivity.class));


            }



        });

        //Class schedulu Button
        Button class_C = (Button) findViewById(R.id.class_C) ;
        assert class_C != null;
        class_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, ClassSchActivity.class));


            }



        });

        //Mess menu Button
        Button mess_C = (Button) findViewById(R.id.mess_C);

        assert mess_C != null;
        mess_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, SixthActivity.class));


            }



        });

        //Bus menu Button
        Button bus_C = (Button) findViewById(R.id.bus_C);

        assert bus_C != null;
        bus_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, BusActivity.class));


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
            Intent i=new Intent(FifthActivity.this, FirstActivity.class);
            startActivity(i);



        }

        return super.onOptionsItemSelected(item);

    }




    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mess_N) {
            startActivity(new Intent(FifthActivity.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(FifthActivity.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(FifthActivity.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(FifthActivity.this,BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(FifthActivity.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(FifthActivity.this,PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(FifthActivity.this,EventsActivity.class));
        } else if (id == R.id.logout) {
            Intent i=new Intent(FifthActivity.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
