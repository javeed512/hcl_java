package com.hcl.oops;

import java.lang.*;

public class Demo extends Object{ // inheritance or IS-A Relationship
	
	
	public String toString() {// method overriding  (runtime polymorphism)
		
		return "javeed";
		
	}
	
	
	
	public  Demo() {// default constructor
		
		super(); // calling parent/super class constructor
		
	}
	
	//parameterized constructor
	public Demo(int id, String name) {
		
		super();
		// having multiple constructor with same name and diff parameters in same class known as constructor overloading
		
		System.out.println("param Demo constructor is called..");
		
	}
	
	

	public static void main(String[] args) {
		
		
			Demo d =	new Demo();
		
			
			System.out.println(d.toString());
			
			Demo d2 = new Demo(101,"tom");
		
			System.out.println(d2.toString());

	}

}
