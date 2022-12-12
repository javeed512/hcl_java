package com.hcl.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.restapi.entity.Employee;
import com.hcl.restapi.respository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class RepositoryTesting {  // testing repository layer without restcontroller and service layer

		@Autowired
		EmployeeRepository repo;
	
		@Test
		@Disabled
		public void   addTest() {
			
			Employee  emp = new Employee();
			
			emp.setEid(90);
			emp.setEname("Tom");
			emp.setSalary(7000);
			
			
		Employee  actual =	repo.save(emp);
		
			log.info("Emp Object Added to DB "+actual);
			
				assertNotNull(actual);
			
		}
		
		
		
		@Test
		@DisplayName("ShowAllTest")
		public void  getAll() {
			
			
			
		List<Employee>  list =		repo.findAll();
			
			log.info("List : "+list);
			
				assertEquals(6, list.size());
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
}
