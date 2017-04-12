package com.example.ramky.timespread;

import java.util.Comparator;

public class MycomparatorWed implements Comparator<Course>{
	
	public int compare(Course c1,Course c2)
	{
		if(c1.getWeekdays().get(2)<c2.getWeekdays().get(2))
		{
			return -1;
		}
		
		else 
		{
			return 0;
		}
	}

}
