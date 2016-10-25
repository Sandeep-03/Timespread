package com.example.ramky.timespread;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {

    TextView tv1,tv2;
    Button button1;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        Button button1 = (Button) findViewById(R.id.button1);

        // to send data from one activity other
        Intent i = new Intent(this,FourthActivity.class);
        i.putExtra("rollno",et1.getText());


        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Login a = new Login();
                String rollno = et1.getText().toString();
                JSONObject j =new JSONObject();
                String json;
                try {
                    j.put("rollNo",rollno);
                    json  = j.toString();
                }

                catch (JSONException e) {
                    e.printStackTrace();
                    json = "false";
                }

                if(a.checkroll(rollno).equals("{response : true}"))
                {
                    startActivity(new Intent(SecondActivity.this, ThirdActivity.class).putExtra("data",json));
                }

                else{
                    et1.setError("Username already exists");
                }
            }
        });
    }
}
