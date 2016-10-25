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


public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder> {






    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_bus,parent,false);
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
        holder.bus.setText(busses.get(position).bus);
        holder.destination.setText(busses.get(position).destination);
        holder.time.setText(busses.get(position).time);
    }

    /*@Override
    public int getItemCount() {
        return 4;
    }
*/
    protected class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView destination;
        private TextView bus;
        private TextView time;
        ViewHolder(View v)
        {
            super(v);
            destination = (TextView) v.findViewById(R.id.destination);
            bus=(TextView) v.findViewById(R.id.bus);
            time=(TextView) v.findViewById(R.id.time);
        }
    }


    List<timetable_b>busses;

    BusAdapter( List<timetable_b> busses){
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
