package com.example.ramky.timespread;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import static com.example.ramky.timespread.R.id.recycler_bus;

/**
 * Created by Ramky on 23/10/2016.
 */


public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {






    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_events,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
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
        holder.pointer.setText(busses.get(position).pointer);
        holder.Package.setText(busses.get(position).Package);
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
    List<timetable_e>busses;

    EventsAdapter( List<timetable_e> busses){
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
