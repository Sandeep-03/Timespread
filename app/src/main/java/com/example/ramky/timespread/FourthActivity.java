package com.example.ramky.timespread;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FourthActivity extends AppCompatActivity {


    TextView tv1,tv2,tc1;
    Button button1;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tc1 = (TextView) findViewById(R.id.tc1);

        tc1.setPaintFlags(tc1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        final EditText et3 = (EditText) findViewById(R.id.et3) ;
        final Button button1 = (Button) findViewById(R.id.button1);
        final String data1 = getIntent().getExtras().getString("data");
        System.out.println(data1);

        tc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://timespread.mybluemix.net/termsandconditions"));
                startActivity(viewIntent);
            }
        });



        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                    if (et2.getText().toString().equals(et3.getText().toString())) {
                        // Not null and OK, launch the activity
                        String data;
                        try
                        {
                            String email = et1.getText().toString();
                            String password =et2.getText().toString();
                            String mess = "A";
                            JSONArray courses = new JSONArray();
                            JSONArray clubs = new JSONArray();
                            JSONArray food = new JSONArray();
                            JSONArray placement = new JSONArray();
                            JSONObject j = new JSONObject(data1);
                            j.put("email",email);
                            j.put("password",password);
                            j.put("mobile",7);
                            j.put("mess",mess);
                            j.put("courses",courses);
                            j.put("clubs",clubs);
                            j.put("food",food);
                            j.put("placement",placement);
                            data = j.toString();
                        }

                        catch (JSONException e) {
                            e.printStackTrace();
                            data ="false";
                        }
                        startActivity(new Intent(FourthActivity.this, NinthActivity.class).putExtra("data",data));

                    } else {
                        // Username or password false, display and an error
                        et2.setError("Password didn't match");
                        et3.setError("password didn't match");

                    }

                }



        });
    }

}
