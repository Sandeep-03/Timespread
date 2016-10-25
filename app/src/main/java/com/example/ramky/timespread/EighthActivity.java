package com.example.ramky.timespread;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



public class EighthActivity extends AppCompatActivity {

    TextView tv1,tv2;
    Button button1;
   EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        Button button1 = (Button) findViewById(R.id.button1);
        final ProgressDialog pd = new ProgressDialog(EighthActivity.this);
        pd.setTitle("Loading");
        pd.setMessage("Wait for a sec....");
        pd.setCancelable(false);


        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                pd.show();
                Login l = new Login();
                String username = et1.getText().toString();
                String password = et2.getText().toString();
                if (l.checklogin(username,password).equals("true")) {
                    // Not null and OK, launch the activity

                    startActivity(new Intent(EighthActivity.this, FifthActivity.class));

                } else {
                    // Username or password false, display and an error
                    pd.dismiss();
                    et2.setError("Username or Password didnt match");
                }
            }
        });
    }
}