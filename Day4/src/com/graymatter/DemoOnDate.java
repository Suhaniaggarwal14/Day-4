package com.graymatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DemoOnDate {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		String pattern="2024-07-18";
	
		date=LocalDate.parse(pattern);
		System.out.println(date);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String myDate=date.format(formatter);
		System.out.println(myDate);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfYear());
		
		System.out.println(time.getHour());
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		String myJoining="2022-03-22";
		LocalDate doj=LocalDate.parse(myJoining);
		String myLeaving="2024-07-18";
		LocalDate dol=LocalDate.parse(myLeaving);
		Period p=Period.between(doj,dol);
		System.out.println(p);
		System.out.println("total period of work="+p.getYears()+" years"+p.getMonths()+" months" +p.getDays()+ " days");
		
	
	}

}
