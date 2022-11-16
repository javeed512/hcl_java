package com.hcl.javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamAPI {

	public static void main(String[] args) {


		
		List<Employee>  list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "king", 50000));
		list.add(new Employee(102, "smith", 40000));
		list.add(new Employee(103, "tom", 60000));
		list.add(new Employee(104, "raj", 30000));
		list.add(new Employee(105, "javeed",5000));
		
		
		Stream<Employee>  stream1 =		list.stream();
		
		/*
		 * stream.map((Employee emp)->{ System.out.println(emp.getEname()); return
		 * emp.getEname().length(); }).forEach((Integer
		 * len)->{System.out.println(len);});
		 */
		
			
			stream1.map((Employee e)->{return e.getEname().toUpperCase();})
					.forEach((String name)->{System.out.println(name);});
		
			
			Stream<Employee>  stream2 =		list.stream();
			
			/*
			 * stream2.filter((Employee emp)->{ return emp.getSalary() > 30000; })
			 * 
			 * .forEach((Employee e)->{System.out.println(e);});
			 */
			
			
			
			
List<Employee> newList =
			stream2.filter((Employee emp)->{ return emp.getSalary() > 30000; })
					.collect(Collectors.toList());
			
					
		System.out.println(newList);
			
		
		
		

		Stream<Employee>  stream3 =		list.stream();
		
		/*
		 * Optional<Double> optional =stream3.map((Employee e)->{ return
		 * e.getSalary();}) .reduce( (Double d1 , Double d2)->{return d1+d2;} );
		 * 
		 * 
		 * if(optional.isPresent()) {
		 * 
		 * System.out.println("Total : "+optional.get());
		 * 
		 * }
		 */
		
	

		
		  Double result =stream3.map((Employee e)->{ return e.getSalary();}) .reduce(
		  (Double d1 , Double d2)->{return d1+d2;} ).orElse(0.0);
		  
		  
		  
		  System.out.println("Sum of all Salaries "+result);
		 
	}
	
	
	
	
			
	
	
	
	

}
