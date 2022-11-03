package com.hcl.exceptions;

public class BlocksDemo {

	public static void main(String[] args) {

		System.out.println("main method");	
		
		new BlocksDemo();
	}

	// static block

	static {

		System.out.println("static block");

	}

	// instance block or anonymous block

	{

		System.out.println("instance block executed..");

	}

}
