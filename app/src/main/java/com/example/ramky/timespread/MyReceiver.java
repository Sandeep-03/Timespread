package com.example.ramky.timespread;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by Ramky on 20/10/2016.
 */

public class MyReceiver extends BroadcastReceiver {
    boolean connect;
    @Override
    public void onReceive(Context context,Intent intent) {

        if (isConnected(context)) {
            Toast.makeText(context, "Connected.", Toast.LENGTH_LONG).show();
            connect = true;
        } else {
            Toast.makeText(context, "Lost connect.", Toast.LENGTH_LONG).show();
            connect = false;
        }
    }
    public boolean isConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnected();
        return isConnected;
    }

    public boolean check(){
        return connect;
    }
}