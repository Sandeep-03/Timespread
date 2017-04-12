package com.example.ramky.timespread;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import static android.R.layout.list_content;
import static android.R.layout.simple_spinner_item;
import static java.security.AccessController.getContext;


/**
 * Created by Ramky on 23/10/2016.
 */


public class PlacementAdapter extends RecyclerView.Adapter<PlacementAdapter.ViewHolder> {





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_placement,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);


        Spinner spinner = (Spinner) v.findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("Select");
        list.add("Going");


        //create an ArrayAdaptar from the String Array
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(parent.getContext(),
              R.layout.spinner, list);
        //set the view for the Drop down list
        dataAdapter.setDropDownViewResource(R.layout.spinner);
        //set the ArrayAdapter to the spinner
        spinner.setAdapter(dataAdapter);
        //attach the listener to the spinner
       // spinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
        spinner.getSelectedItem();
        return viewHolder;
    }


    /*@Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bus.setText("college bus");
        holder.destination.setText("ajmeri gate");
        holder.time.setText("9:00");
    }*/
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.company.setText(busses.get(position).company);
        holder.positions.setText(busses.get(position).positions);
        holder.pointer.setText("Pointer Criteria: "+busses.get(position).pointer.toString());
        holder.Package.setText("Package(LPA): "+busses.get(position).Package.toString());
    }

    /*@Override
    public int getItemCount() {
        return 4;
    }
*/
    protected class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView company;
        private TextView positions;
        private TextView pointer;
        private TextView Package;
        ViewHolder(View v)
        {
            super(v);
            company = (TextView) v.findViewById(R.id.company);
            positions=(TextView) v.findViewById(R.id.positions);
            pointer=(TextView) v.findViewById(R.id.pointer);
            Package=(TextView) v.findViewById(R.id.Package);
        }
    }


    List<timetable_p>busses;

    PlacementAdapter( List<timetable_p> busses){
        this.busses = busses;

    }
    @Override
    public int getItemCount() {
        return busses.size();
    }


   /* class timetable_b {
        String destination;
        String time;
        String bus;

        timetable_b(String destination, String time, String bus) {
            this.destination = destination;
            this.time = time;
            this.bus = bus;
        }
    }*/




}
