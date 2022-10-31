package com.hcl.oops;

public  class Parent extends Object {

	public Parent() {
		super(); // calling super class default constructor
		
		System.out.println("Parent() called Parent obj created ...");
	}
	
	int pid = 100;
	
	public void   m1() {
		
		System.out.println("m1() is called from Parent");
		
		
	}
	
	public String toString() {
		
		
		return "Parent toString";
	}
	
	
	
}
