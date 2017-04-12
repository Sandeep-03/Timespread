package com.example.ramky.timespread;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SubjectsActivity_1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    ListView listview ;
    Button next;
    TextView sub;
    String[] ListViewItems = new String[] {
            "PPL",
            "GAA",
            "TOC",
            "MEM",
            "INSE",
            "OS BATCH-A",
            "OS BATCH-B",
            "SWE BATCH-A",
            "SWE BATCH-B",
            "MICROI",
            "DSP",
            "DIGITAL COMMUNICATION"

    };
    SparseBooleanArray sparseBooleanArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_1);
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
                startActivity(new Intent(SubjectsActivity_1.this, ProfileActivity.class));

            }
        });


        final TextView sub = (TextView) findViewById(R.id.sub);
        listview = (ListView)findViewById(R.id.listView);
        Login a = new Login();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (SubjectsActivity_1.this,
                        android.R.layout.simple_list_item_multiple_choice,
                        android.R.id.text1, ListViewItems );



        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub

                sparseBooleanArray = listview.getCheckedItemPositions();
                int x=listview.getCheckedItemCount();
                String ValueHolder = "" ;

                int i = 0 ;

                while (i < sparseBooleanArray.size()) {

                    if (sparseBooleanArray.valueAt(i)) {

                        ValueHolder += ListViewItems [ sparseBooleanArray.keyAt(i) ] + ",";
                        System.out.print(ValueHolder);
                    }

                    i++ ;
                }

                ValueHolder = ValueHolder.replaceAll("(,)*$", "");

                sub.setText("Subjects Selected "+x );
            }
        });
        Button next = (Button) findViewById(R.id.next);
        assert next != null;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubjectsActivity_1.this, ProfileActivity.class));
            }


        });
    }








    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mess_N) {
            startActivity(new Intent(SubjectsActivity_1.this, SixthActivity.class));
        } else if (id == R.id.home_N) {
            startActivity(new Intent(SubjectsActivity_1.this, FifthActivity.class));
        } else if (id == R.id.daily_N) {
            startActivity(new Intent(SubjectsActivity_1.this, DailyActivity.class));
        } else if (id == R.id.bus_N) {
            startActivity(new Intent(SubjectsActivity_1.this,BusActivity.class));
        } else if (id == R.id.class_N) {
            startActivity(new Intent(SubjectsActivity_1.this,ClassSchActivity.class));
        } else if (id == R.id.placement_N) {
            startActivity(new Intent(SubjectsActivity_1.this,PlacementActivity.class));
        } else if (id == R.id.events_N) {
            startActivity(new Intent(SubjectsActivity_1.this,EventsActivity.class));
        } else if (id == R.id.logout) {
            Intent i=new Intent(SubjectsActivity_1.this, FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
