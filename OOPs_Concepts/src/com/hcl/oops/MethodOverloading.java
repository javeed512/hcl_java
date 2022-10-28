package com.hcl.oops;

public class MethodOverloading {

	public static void main(String[] args) {


		
		MethodOverloading m = new MethodOverloading();
		
			m.add();
		
		System.out.println(m.add(2,4));
		
		System.out.println(m.add(5,"javeed"));
		

	}
	
	
	
	void add() {
		
		System.out.println("add with zero param");
		
	}
	
	int add(int a,int b) {
		System.out.println("add with 2 param");
		
		return a+b;
		
	}
	
	int add(int a, String b) {
		
		System.out.println(b);
		return a;
	}
	

	int add(int a,int b , int c) {
		System.out.println("add with 3 param");
		
		return a+b+c;
	}
	
	
}
