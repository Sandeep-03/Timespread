package com.example.ramky.timespread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class SubjectsActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_subjects);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Choose Subjects");

        final TextView sub = (TextView) findViewById(R.id.sub);
        listview = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (SubjectsActivity.this,
                        android.R.layout.simple_list_item_multiple_choice,
                        android.R.id.text1, ListViewItems );

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new OnItemClickListener()
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

                    startActivity(new Intent(SubjectsActivity.this, FifthActivity.class));
                }


            });
        }

    }
