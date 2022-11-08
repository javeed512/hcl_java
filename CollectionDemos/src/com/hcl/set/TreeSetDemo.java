package com.hcl.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

			Set<String> set = new TreeSet<String>();
		
				set.add("CAT");
				set.add("ANT");
				set.add("DOG");
				set.add("BULL");
				
				
				//System.out.println(set);
			
				
		Set<Employee> set2  = new TreeSet<Employee>(new MyComparator());
		
			Employee emp1 = new Employee(101,"Tom",5000);
			Employee emp2 = new Employee(103,"Smith",4000);
			Employee emp3 = new Employee(104,"Adam",6000);
			Employee emp4 = new Employee(102,"Ford",3000);
		
		
			set2.add(emp1);
			set2.add(emp2);
			set2.add(emp3);
			set2.add(emp4);
			
		
			for (Employee employee : set2) {
				
				System.out.println(employee);
			}
			
		
		
	}

}
