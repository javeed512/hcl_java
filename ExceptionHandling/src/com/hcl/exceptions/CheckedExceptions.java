package com.hcl.exceptions;

public class CheckedExceptions {

	public static void main(String[] args) {

		System.out.println("Hello Friends");

		
		
		
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thank you");

	}

}
