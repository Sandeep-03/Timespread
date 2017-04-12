package com.example.ramky.timespread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramky on 24/10/2016.
 */

public class timetable_c {
    String course;
    String instructor;
    String time;
    String lt;

    timetable_c(String course,String instructor, String time, String lt) {
        this.course = course;
        this.instructor = instructor;
        this.time = time;
        this.lt = lt;
    }


   /* public List<timetable_b> busses;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        busses = new ArrayList<>();
        busses.add(new timetable_b("Ajmer", "9:00", "college bus"));
        busses.add(new timetable_b("raja", "9:00", "college bus"));
        busses.add(new timetable_b("Lillie Watts", "35 years old", "govt"));
    }*/}
