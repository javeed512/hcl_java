package com.hcl.restapi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.restapi.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class EmployeeServiceImpTest {

	
	@Autowired
	IEmployeeService service;
	
	
	@Test
	void testAddEmployee() {
		
		Employee emp = new Employee();
		emp.setEid(112);
		emp.setEname("Akash");
		emp.setSalary(9000);
		
	Employee emp1 =	service.addEmployee(emp);
	
	 assertEquals(9000, emp1.getSalary());
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testDeleteEmployeeById() {
		
		service.deleteByEname("Tom");
		
	Employee emp =	service.getEmployeeByName("Tom");
	
			log.info(emp+"");
			
			assertNull(emp);
		
	}

	@Test
	void testGetEmployeeByName() {
		
	}

}
