package com.example.ramky.timespread;

/**
 * Created by Ramky on 22/10/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Thu_fm extends Fragment {

    TextView B;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thu_m, container, false);


        Login l = new Login();
        Messmenu m1 = new Messmenu();
        m1 = l.getM();
        int i,b=m1.getMenuData().get(3).getBreakFast().getItems().size();
        int lu=m1.getMenuData().get(3).getLunch().getItems().size();
        int s=m1.getMenuData().get(3).getSnacks().getItems().size();
        int d=m1.getMenuData().get(3).getDinner().getItems().size();

        //printing Breakfast
        for(i=0;i<b;i++){
            B = new TextView(getContext());
            LinearLayout linear1 = (LinearLayout) view.findViewById(R.id.linear1);
            B.setText((m1.getMenuData().get(3).getBreakFast().getItems().get(i)));
            linear1.addView(B);}

        //printinng lunch
        for(i=0;i<lu;i++){
            B = new TextView(getContext());
            LinearLayout linear2 = (LinearLayout) view.findViewById(R.id.linear2);
            B.setText((m1.getMenuData().get(3).getLunch().getItems().get(i)));
            linear2.addView(B);}

        //printing snacks
        for(i=0;i<s;i++){
            B = new TextView(getContext());
            LinearLayout linear3 = (LinearLayout) view.findViewById(R.id.linear3);
            B.setText((m1.getMenuData().get(3).getSnacks().getItems().get(i)));
            linear3.addView(B);}

        //printing dinner
        for(i=0;i<d;i++){
            B = new TextView(getContext());
            LinearLayout linear4 = (LinearLayout) view.findViewById(R.id.linear4);
            B.setText((m1.getMenuData().get(3).getDinner().getItems().get(i)));
            linear4.addView(B);}

        return  view;
    }
}