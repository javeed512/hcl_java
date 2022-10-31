package com.hcl.oops;

public class Child extends Parent {

	public String toString() { // method overriding

		return "Child toString method";

	}

	public void m1() { // method overriding

		System.out.println("m1() from child");

	}

	public Child() {
		super(); // calling super class default constructor

		System.out.println("Child() called Child obj created ...");
	}

	int cid = 99;

	public void m2() {

		System.out.println("m2() is called from Child");

	}

	public static void main(String[] args) {

		Parent p = new Parent();

		System.out.println(p.pid);
		System.out.println(p.toString());
		p.m1();

		Child c = new Child();

		System.out.println(c.cid);
		c.m2();

		c.m1();

		System.out.println(c.toString());

		Parent p1 = new Parent();

		Child c1 = new Child();

		Object o = new Object();
		
	
		
		Parent p2 = (Parent) new Child();
		
		
		Child c2 = (Child)p2;
		
			p2.m1();
		
			Object o2 = new String();
			
			String s1 = (String) o2;
			
		String s2 = p2.toString();
			

	}

}
