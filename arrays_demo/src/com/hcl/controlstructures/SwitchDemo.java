package com.hcl.controlstructures;

import java.util.Scanner;

public class SwitchDemo extends Object{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		
		while(flag) {
		
		System.out.println("****Welcome****");
		System.out.println("1.Add Product");
		System.out.println("2. Checkout");
		System.out.println("3. Payment");
		System.out.println("4. Product delivery");
		System.out.println("5. Exit");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Product added..");

			break;

		case 2:

			System.out.println("Checkout done");

			break;

		case 3:

			System.out.println("Payment done");

			break;
		case 4:

			System.out.println("Product dispatch for delivery");

			break;
			
		case 5:
			
			flag = false;
			System.out.println("Thank you visit again..");
			
			break;

		default:
			
				System.err.println("Invalid Option");
			
			break;
		}
		
		}

	}

}
