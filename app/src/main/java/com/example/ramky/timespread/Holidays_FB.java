package com.example.ramky.timespread;

/**
 * Created by Ramky on 22/10/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.example.ramky.timespread.R.id.recycler_bus;

public class Holidays_FB extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.holidays_b, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_bus);
        /*adapter = new BusAdapter(getActivity().getApplicationContext());*/

        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       /* recyclerView.setAdapter(adapter);*/

        List<timetable_b> busses;

        Login l = new Login();
        int i;
        Bustimetable b1 = l.getB();

        busses = new ArrayList<>();

        for(i=0;i<b1.getScheduleData().get(1).getTimings().size();i++) {

            busses.add(new timetable_b(b1.getScheduleData().get(1).getTimings().get(i).getOrigin()+"->"+b1.getScheduleData().get(1).getTimings().get(i).getDestination(), b1.getScheduleData().get(1).getTimings().get(i).getTime(), b1.getScheduleData().get(1).getTimings().get(i).getBusType()));

        }




        BusAdapter adapter = new BusAdapter(busses);
        recyclerView.setAdapter(adapter);



         /*adapter = new BusAdapter(busses);*/


        recyclerView.setLayoutManager(linearLayoutManager);
        return v;
    }
}