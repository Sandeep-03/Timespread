package com.example.ramky.timespread;

import android.app.Application;
import android.content.Context;

/**
 * Created by Ramky on 24/10/2016.
 */

public class Mycontext extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        Mycontext.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return Mycontext.context;
    }
}
