
package com.graymatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class DemoOnDateAndClass {
	public static void main(String[] args) throws ParseException {
//		Date date=new Date();
//		System.out.println(date);
//		
//		Date date1=new Date("7/18/24");
//		//Date date2=new Date("7-18-24");
//		
//		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy",Locale.US);
		String sDate="2018-10-23";
//		
//		Date dt=format.parse(sDate);
//		System.out.println(dt);
//		
//		LocalDate lcdt=LocalDate.now();
//		System.out.println(lcdt);
//		
//		lcdt=LocalDate.of(2024, 7, 18);
//		System.out.println(lcdt);
		
		
		
//		lcdt=lcdt.parse(sDate);
//		System.out.println(lcdt);
		
//		 LocalDate lt = LocalDate.parse(sDate);
//		 System.out.println(lt);
//		 
//		 
//		 
//		  String sDate1 = "18-07-2024";
//	        
//	        // Define the formatter for the date pattern "dd-MM-yyyy"
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//	        
//	        // Parse the string into a LocalDate object using LocalDate.parse
//	        LocalDate lcdt = LocalDate.parse(sDate1, formatter);
//	        
//	        // Print the LocalDate object
//	        System.out.println(lcdt);
	        
	       
	        LocalDate date=LocalDate.now();
	        
	        String pattern="2024-07-18";
	        
	        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        
	        	String myDate=date.format(form);
	        	System.out.println(myDate);

	        	
	       LocalTime time=LocalTime.now();
	       System.out.println(time);
	       
	       System.out.println(time.getHour());
	       System.out.println(date.getDayOfMonth());
	       System.out.println();
	       System.out.println();
	       
	       
	       String myJoining="2024-07-08";
	       LocalDate doj=LocalDate.parse(myJoining);
	       
	       String myLeaving="2024-09-20";
	       LocalDate dol=LocalDate.parse(myLeaving);
	       
	       Period p=Period.between(doj, dol);
	       System.out.println(p);
	       
	       
	       System.out.println("Total Period of Time Worked "+p.getYears()+" years "+p.getMonths()+" month "+p.getDays()+" days ");
	       
	       
		
		
		
	}

}
