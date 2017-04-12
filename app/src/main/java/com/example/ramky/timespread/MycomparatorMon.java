package com.example.ramky.timespread;

import java.util.Comparator;

public class MycomparatorMon implements Comparator<Course>{
	
	public int compare(Course c1,Course c2)
	{
		if(c1.getWeekdays().get(0)<c2.getWeekdays().get(0))
		{
			return -1;
		}
		
		else 
		{
			return 0;
		}
	}

}
