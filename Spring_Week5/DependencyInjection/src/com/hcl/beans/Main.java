package com.hcl.beans;

public class Main {

	public static void main(String[] args) {

		Address a1 = new Address();
		a1.setAid(501);
		a1.setCity("Hyderabad");
		
		
		
		
		Employee e1 = new Employee();
		
			e1.setEid(101);
			e1.setEname("Javeed");
			e1.setAddress(a1);   // setter method dependency injection
		
		
			
			
	Employee e2 = new Employee(102, "Charan", a1); // construtor DI		
		

	}

}
