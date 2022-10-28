package com.hcl.oops;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
			e1.eid = 101;
			e1.ename  = "tom";
			e1.salary = 5000;
			
			
			System.out.println(e1.eid + " " + e1.ename + " " + e1.salary);

		Employee e2 = new Employee();

		System.out.println(e2.eid + " " + e2.ename + " " + e2.salary);

	}

}
