package com.date;

import java.util.Scanner;

public class DateExecution {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateOperation obD=new DateOperation();
		Scanner ob=new Scanner(System.in);
		int numberOfAdvanceDate=ob.nextInt();
		
		ob=new Scanner(System.in);
		int numberOfBackwardDate=ob.nextInt();
		
		
		obD.displayDayMonthYear();
		System.out.println("Current Date "+obD.getCurrentDate());
		System.out.println(numberOfAdvanceDate + " Advance Date "+obD.getAdvanceDate(numberOfAdvanceDate));
		System.out.println(numberOfBackwardDate + "  Backward Date "+obD.getBackwardDate(numberOfBackwardDate));
		
	}

}
