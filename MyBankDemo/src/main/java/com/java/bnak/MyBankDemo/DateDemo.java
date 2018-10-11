package com.java.bnak.MyBankDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] a) throws ParseException {
		
		Date today  = new Date();
		
		System.out.println(today);
		
		
		
		String date1Str = "05/20/2018";
		String date2Str = "09/25/2018";
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		
		
		Date d1 = format.parse(date1Str);
		
		Date d2 = format.parse(date2Str);
		System.out.println(d2);
		System.out.println(d1);
		
			System.out.println(d1.compareTo(d2));
			
			System.out.println(d1.equals(d2));
			
			System.out.println(d2.after(d1));
			
			DateDemo obj  = new DateDemo();
			
			String myDueDate = obj.getDueDate(1234);
			
			System.out.println("My DUe Date : "+myDueDate);
			
			
		
		
	}
	
	public String getDueDate(int acctnumber) {
		//Due date fromDB of type Date
		
		Date dueDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		String dueDateString = format.format(dueDate);
		
		return dueDateString;

		
	}

}
