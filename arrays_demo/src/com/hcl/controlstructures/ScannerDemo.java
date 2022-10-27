package com.hcl.controlstructures;

import java.lang.String; // default package
import java.lang.System;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {


		System.out.println("Enter your name");
		
		Scanner scanner = new Scanner(System.in);
		
		//String myname = scanner.next();
		
		String myname = scanner.nextLine();

		System.out.println("Welcome "+myname);
		
		System.out.println("Enter Salary");// "5000"
		
			int salary =	scanner.nextInt();
		
			System.out.println(salary+100);
			
			
			scanner.nextLine();// handle enter key
			
	System.out.println("Enter city");
	
		String city = scanner.nextLine();
		
		System.out.println("Your city name "+city);
			
			
	}

}
