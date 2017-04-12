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

public class Mon_c extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.mon_c, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_ClassSch);
        /*adapter = new BusAdapter(getActivity().getApplicationContext());*/

        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       /* recyclerView.setAdapter(adapter);*/

        List<timetable_c> busses;

        Login l = new Login();
        int i;
        ArrayList<Course> c1 = Login.mon;

        busses = new ArrayList<>();

        for(i=0;i<c1.size();i++) {

            busses.add(new timetable_c(c1.get(i).getName(),c1.get(i).getProfessor(),"",l.convertTime(c1.get(i).getWeekdays().get(0))));
        }
        c1.clear();

        ClassSchAdapter adapter = new ClassSchAdapter(busses);
        recyclerView.setAdapter(adapter);



         /*adapter = new BusAdapter(busses);*/


        recyclerView.setLayoutManager(linearLayoutManager);
        return v;
    }
}