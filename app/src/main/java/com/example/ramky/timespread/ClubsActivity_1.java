package com.example.ramky.timespread;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClubsActivity_1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    int a=0,b=0,c=0,d=0,e=0,f=0,x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(ClubsActivity_1.this);
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
                startActivity(new Intent(ClubsActivity_1.this, ProfileActivity.class));


            }



        });

        final TextView sub = (TextView) findViewById(R.id.sub);

        Button done = (Button) findViewById(R.id.done);
        assert done != null;
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(ClubsActivity_1.this, ProfileActivity.class));
            }


        });

        //Placement Button
        final Button placement_C = (Button) findViewById(R.id.placement_C);
        assert placement_C != null;
        placement_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(a==0){
                    placement_C.setBackgroundResource(R.drawable.border);
                    a++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    placement_C.setBackgroundResource(R.color.white);
                    a--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
            }


        });

        //Class schedulu Button
        final Button class_C = (Button) findViewById(R.id.class_C);
        assert class_C != null;
        class_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(b==0){
                    class_C.setBackgroundResource(R.drawable.border);
                    b++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    class_C.setBackgroundResource(R.color.white);
                    b--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }


            }


        });

        //Mess menu Button
        final Button mess_C = (Button) findViewById(R.id.mess_C);

        assert mess_C != null;
        mess_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(c==0){
                    mess_C.setBackgroundResource(R.drawable.border);
                    c++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    mess_C.setBackgroundResource(R.color.white);
                    c--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }


            }


        });

        //Bus buss Button
        final Button bus_C = (Button) findViewById(R.id.bus_C);

        assert bus_C != null;
        bus_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(d==0){
                    bus_C.setBackgroundResource(R.drawable.border);
                    d++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    bus_C.setBackgroundResource(R.color.white);
                    d--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
            }

        });

        //daily Button
        final Button daily_C = (Button) findViewById(R.id.daily_C);

        assert daily_C != null;
        daily_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(e==0){
                    daily_C.setBackgroundResource(R.drawable.border);
                    e++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    daily_C.setBackgroundResource(R.color.white);
                    e--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }


            }


        });

        //events Button
        final Button events_C = (Button) findViewById(R.id.events_C);

        assert events_C != null;
        events_C.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(f==0){
                    events_C.setBackgroundResource(R.drawable.border);
                    f++;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }
                else{
                    events_C.setBackgroundResource(R.color.white);
                    f--;
                    x=a+b+c+d+e+f;
                    System.out.print(+x);
                    sub.setText("Clubs Choosen "+x);
                }


            }


        });;

    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mess_N) {
            startActivity(new Intent(ClubsActivity_1.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(ClubsActivity_1.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(ClubsActivity_1.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(ClubsActivity_1.this,BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(ClubsActivity_1.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(ClubsActivity_1.this,PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(ClubsActivity_1.this,EventsActivity.class));
        } else if (id == R.id.logout) {
            Intent i=new Intent(ClubsActivity_1.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}


