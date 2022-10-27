package com.hcl.demo;

public class DataTypesDemo {

	public static void main(String[] args) {


		byte b =  10; // implicit type casting or 
		short s =  (short) 20;
		char  ch = 'A';
		
		int  i = 99;
		long l =  100000000000L;
		
		double d = 3.999;
		
		float f = 4.55f;
		
		float f1 =(float)  l;
		
		int x =  b; // implicit type casting 
						// widening
		
		byte z = (byte)i; // explicit type casting
		
		// narrowing

			System.out.println(b);
			System.out.println(s);
			System.out.println(ch);
			System.out.println(d);
			System.out.println(z);
			System.out.println(f);
		
			System.out.println(f1);
		
		
		
	}

}
