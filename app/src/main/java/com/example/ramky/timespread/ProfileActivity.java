package com.example.ramky.timespread;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.MotionEvent;
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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ProfileActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    EditText name,email;
    TextView rollno,v,textView,textView1,textView2,badge;
    Button clubs,subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        Login l = new Login();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        View hView =  navigationView.getHeaderView(0);
        TextView v = (TextView)hView.findViewById(R.id.viewprofile);
        TextView textView = (TextView)hView.findViewById(R.id.textview);
        TextView textView1 = (TextView)hView.findViewById(R.id.textview1);
        TextView textView2 = (TextView)hView.findViewById(R.id.textview2);
        TextView badge = (TextView) findViewById(R.id.badge);
       badge.setText(l.badge(Login.u.getFullName()));
        textView1.setText(Login.u.getFullName());
        textView.setText(l.badge(Login.u.getFullName()));

        TextView contact = (TextView)findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://timespread.mybluemix.net/contact_us"));
                startActivity(viewIntent);
            }
        });

        TextView feedback = (TextView)findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://timespread.mybluemix.net/feedback"));
                startActivity(viewIntent);
            }
        });

        assert v !=null;
        v.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, ProfileActivity.class));


            }



        });

        Button clubs = (Button)findViewById(R.id.club);
        assert clubs != null;
        clubs.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,ClubsActivity_1.class));


            }



        });

        Button subjects = (Button)findViewById(R.id.subjects);
        assert subjects != null;
        subjects.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,SubjectsActivity_1.class));


            }



        });


        final EditText name = (EditText) findViewById(R.id.name);
        final EditText email =(EditText)findViewById(R.id.email);
        TextView rollno = (TextView)findViewById(R.id.rollno);
        rollno.setText(Login.u.getRollNo());
        ImageButton pencil =(ImageButton)findViewById(R.id.pencil);
        name.setEnabled(false);
        name.setText(Login.u.getFullName());
        pencil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               name.setEnabled(true);

            }
        });

        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.relative);
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    name.setEnabled(false);
                    email.setEnabled(false);
            }

        });


        email.setEnabled(false);
        email.setText(Login.u.getEmail());
        ImageButton pencil1 =(ImageButton)findViewById(R.id.pencil1);
        pencil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email.setEnabled(true);

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
            startActivity(new Intent(ProfileActivity.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(ProfileActivity.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(ProfileActivity.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(ProfileActivity.this,BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(ProfileActivity.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(ProfileActivity.this,PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(ProfileActivity.this,EventsActivity.class));
        } else if (id == R.id.logout) {
            Intent i=new Intent(ProfileActivity.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
