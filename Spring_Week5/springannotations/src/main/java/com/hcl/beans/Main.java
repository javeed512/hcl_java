package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hcl.beans")
public class Main {

	public static void main(String[] args) {

// spring annotation config IOC Container
		
	ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		Address a1 = context.getBean(Address.class);// Autowire by Type/Class
			
				a1.setDoorNo(555);
				a1.setCity("Hyderabad");
		
		
		Employee e1 =	 context.getBean("emp1", Employee.class); // Autowire by Name reference
		
		Employee e2 = context.getBean(Employee.class);
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		System.out.println(a1);
			e1.setEid(101);
			e1.setEname("Tom");
			e1.setAddress(a1); // setter method DI
			
			System.out.println(e1.getEid() +" "+e1.getEname() +" "+e1.getAddress());
			
			//Employee e2 = new Employee(111, "King", a1); //constructor DI
		
			
			System.out.println("-------scope of beans -----");
			
			
			
		//Thread t1 = context.getBean(Thread.class);

		 	
		 	
		 	//System.out.println(t1);
	}

	
	@Bean
	public Thread  getThreadObj() {
		
		
		return new Thread();
		
		
	}
	
	
}
