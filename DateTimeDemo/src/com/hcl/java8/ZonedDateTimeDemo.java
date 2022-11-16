package com.hcl.java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {

		ZonedDateTime zoneDate = ZonedDateTime.now();

		System.out.println(zoneDate);

		ZonedDateTime parisDate = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

		System.out.println(parisDate);

		LocalDate date = LocalDate.now();

		System.out.println(date);

		LocalDate independence = LocalDate.of(1947, 8, 15);

		System.out.println(independence);
		
		
			Period  period =	independence.until(date);
		
			System.out.println(period.get(ChronoUnit.YEARS));
			
			System.out.println(period.get(ChronoUnit.MONTHS));
			
			System.out.println(period.get(ChronoUnit.DAYS));
			
			
			
			LocalDate date1 = LocalDate.now();

			System.out.println(date1);
			
		DateTimeFormatter formatter =	DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
			
			
		String  newDate =	formatter.format(date1);
			
			System.out.println(newDate);
			
			
		DateTimeFormatter myformatter =	DateTimeFormatter.ofPattern("dd/MM/yyyy");  // MM - for month                // time format hh:mm:ss
				
		// Enter taskDate  15/12/2020
			
		String  input = "01/12/2022";
			
			
		LocalDate  mydate =		LocalDate.parse(input,myformatter);
				
			//task.setTaskDate(mydate);
		
					System.out.println(mydate);
				
					
					//task.setTaskDate(LocalDate.now());
			
			

	}

}
