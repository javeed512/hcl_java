package com.hcl.controlstructures;

import java.lang.*;

public class IfElseDemo {

	public static void main(String[] args) {

		String day = "Tuesday";
		// String s = new String("Friday");

		if (day.equals("Monday")) {

			System.out.println("Its " + day);

		}

		else if (day.equals("Tuesday")) {

			System.out.println("Its " + day);

		}

		else if (day.equals("Wednesday")) {

			System.out.println("Its " + day);

		}

		
		else {
			
			System.out.println("Invalid day");
			
		}
		
	}

}
