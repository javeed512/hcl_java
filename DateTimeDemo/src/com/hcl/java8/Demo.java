package com.hcl.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {
		
		
	LocalDate  date =	LocalDate.now();
		
		System.out.println(date);
	
	 LocalDate  independence = LocalDate.of(1947, 8, 15);
	 
	 System.out.println(independence);
	 
	 		
	 	System.out.println(date.getDayOfMonth());
	 	
	 	System.out.println(date.getDayOfYear());
	 	
	 	System.out.println(date.getDayOfWeek());

	 	System.out.println(date.getMonthValue());
	 	
	 	System.out.println(date.getMonth());
	 	
	 	
	 	System.out.println(date.plusMonths(1));
	 
	 	System.out.println(date.plusYears(2));
	 
	 	LocalDate d = date.plusYears(2);
	 	
	 		System.out.println(d.getDayOfWeek());
		
	 	
	 		System.out.println(date.minusYears(22));
	 		
		
	 		System.out.println(date.isLeapYear());
	 		
	 		
	 		 LocalDate  d2 = LocalDate.of(2020,1,1);
	 		
	 		System.out.println(d2.isLeapYear());
	 		
	 		
	 		System.out.println(date.isAfter(independence));
	 		
	 		System.out.println(date.isBefore(independence));
		
	 		System.out.println(date.withMonth(3));
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	}

}
