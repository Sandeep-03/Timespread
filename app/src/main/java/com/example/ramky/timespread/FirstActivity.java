package com.example.ramky.timespread;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    ImageView imv;
    TextView tv1,tv2;
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        ImageView imv = (ImageView) findViewById(R.id.imv);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        //if(network()) {

            assert button2 != null;
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   // if (network()) {
                        startActivity(new Intent(FirstActivity.this, SecondActivity.class));
                    //} else
                       // Toast.makeText(FirstActivity.this, "No Internet Connection", Toast.LENGTH_LONG).show();
                }
            });

            assert button1 != null;
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (network()) {
                        startActivity(new Intent(FirstActivity.this, EighthActivity.class));
                    } else
                        Toast.makeText(FirstActivity.this, "No Internet Connection", Toast.LENGTH_LONG).show();
                }
            });
       // }
       // else
           // Toast.makeText(FirstActivity.this, "No Internet Connection", Toast.LENGTH_LONG).show();

    }

    boolean network(){
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            return true;
        }
        else
            return false;
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}

