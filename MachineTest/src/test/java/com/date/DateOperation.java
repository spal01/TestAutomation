package com.date;

import java.util.Calendar;

public class DateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		  cal.add(Calendar.DAY_OF_MONTH, 20);
		  
		 String date=String.valueOf(cal.get(Calendar.DATE));
		 
		 System.out.println(date);
		 String month=String.valueOf(cal.get(Calendar.MONTH)+1);
		 System.out.println(month);

		 
		 String year=String.valueOf(cal.get(Calendar.YEAR));
		 System.out.println(year);

	}

}
