package com.hcl.myapp.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hcl.myapp.beans.Address;
import com.hcl.myapp.beans.Employee;
import com.hcl.myapp.repository.EmployeeRepo;
import com.hcl.myapp.service.IService;
import com.hcl.myapp.service.ServiceImp;

public class Client {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

				
		
		Employee e1  = 	context.getBean(Employee.class);
		
		
		Address a1 =  context.getBean(Address.class);
		
		
		System.out.println(e1);
		System.out.println(e1.getAddress());
		
		
		
		IService service =	context.getBean(ServiceImp.class);
		
		service.getService();
		
		
			EmployeeRepo empRepo =		context.getBean(EmployeeRepo.class);
		
			
			JdbcTemplate jdbcTemplate =	empRepo.getJdbcTemplate();
		
			System.out.println(jdbcTemplate);
			
	}

}
