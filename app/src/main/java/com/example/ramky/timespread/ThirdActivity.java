package com.example.ramky.timespread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class ThirdActivity extends AppCompatActivity {

    TextView tv1,tv2;
    Button button1;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        Button button1 = (Button) findViewById(R.id.button1);
       final String data1 = getIntent().getExtras().getString("data");

        System.out.println(data1);


        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data;
                try {
                    String name = et1.getText().toString();
                    JSONObject jsonObj = new JSONObject(data1);
                    jsonObj.put("fullName",name);
                    data = jsonObj.toString();
                    System.out.println(data);
                }

                catch (JSONException e) {

                    e.printStackTrace();
                    data = "false";

                }

                startActivity(new Intent(ThirdActivity.this, FourthActivity.class).putExtra("data",data));
            }
        });

    }
}
