package com.example.ramky.timespread;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
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


public class ClubsActivity extends AppCompatActivity
{
    Button mess_C;
    Button bus_C,placement_C;
    Button class_C,events_C,daily_C;
    int a=0,b=0,c=0,d=0,e=0,f=0,x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Login l = new Login();
        final TextView sub = (TextView) findViewById(R.id.sub);

        Button done = (Button) findViewById(R.id.done);
        assert done != null;
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Login l = new Login();
                //l.addcourses();
                startActivity(new Intent(ClubsActivity.this, FifthActivity.class));
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


        });


    }
}











