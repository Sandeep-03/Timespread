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

public class Mon2fri_FB extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.mon2fri_b, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_bus);
        /*adapter = new BusAdapter(getActivity().getApplicationContext());*/

        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       /* recyclerView.setAdapter(adapter);*/

         List<timetable_b> busses;

        busses = new ArrayList<>();

        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "7:00 AM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "8:00 AM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "8:00 AM", "Govt Bus"));
        busses.add(new timetable_b("LNMIIT -> Chomu Puliya", "9:15 AM", "Govt Bus"));
        busses.add(new timetable_b("LNMIIT -> Pink Square", "11:00 AM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "12:00 PM", "Govt Bus"));
        busses.add(new timetable_b("Pink Square -> LNMIIT", "1:30 PM", "College Bus"));
        busses.add(new timetable_b("LNMIIT -> Pink Square", "3:05 PM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "4:00 PM", "Govt Bus"));
        busses.add(new timetable_b("Pink Square -> LNMIIT", "5:30 PM", "College Bus"));
        busses.add(new timetable_b("LNMIIT -> Chomu Puliya", "5:30 PM", "Govt Bus"));
        busses.add(new timetable_b("LNMIIT -> Ajmeri Gate", "7:00 PM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "8:30 pM", "College Bus"));
        busses.add(new timetable_b("Ajmeri Gate -> LNMIIT", "9:30 pM", "College Bus"));




        BusAdapter adapter = new BusAdapter(busses);
        recyclerView.setAdapter(adapter);



         /*adapter = new BusAdapter(busses);*/


        recyclerView.setLayoutManager(linearLayoutManager);
        return v;
    }
}