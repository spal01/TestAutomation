package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateOperation {
	
	private SimpleDateFormat sdf;
	private Date date;
	private Calendar cal;
	private String currentDate;
	private String advancedDate;
	private String backwardDate;
 
 public DateOperation(){
	 sdf=new SimpleDateFormat("dd/MM/yyyy");
	 date=null;
	 cal=null;
	 currentDate="";
	 advancedDate="";
	 backwardDate="";	 
	}
	
	
public String getCurrentDate(){
	cal=Calendar.getInstance();
	date=cal.getTime();
	currentDate=sdf.format(date);
	
	return currentDate;	
	
}	
	
public String getAdvanceDate(int numberOfDayAdvance){
	
	cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH, numberOfDayAdvance);
	date=cal.getTime();
	advancedDate=sdf.format(date);
	
	return advancedDate;
}

public String getBackwardDate(int numberOfDayAdvance){
	cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH, -numberOfDayAdvance);
	date=cal.getTime();
	backwardDate=sdf.format(date);
	
	return backwardDate;

}

public void displayDayMonthYear(){
	cal=Calendar.getInstance();
	System.out.println("Date "+cal.get(Calendar.DATE));
	System.out.println("Month " +(cal.get(Calendar.MONTH)+1));
	System.out.println("Year " +cal.get(Calendar.YEAR));
	
	
	
}

	
	
}


