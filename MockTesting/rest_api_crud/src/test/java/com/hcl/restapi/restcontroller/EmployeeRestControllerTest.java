package com.hcl.restapi.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hcl.restapi.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;
	
	public final String BASE_URL = "http://localhost:8080/api/employees";

	@Test
	void testAdd() {
		
		Employee emp = new Employee();
		
		emp.setEid(102);
		emp.setEname("Shruthika");
		emp.setSalary(20000);
		
		
	Employee emp1 =	restTemplate.postForObject("http://localhost:8080/api/employees/add",emp , Employee.class);
		
			assertEquals(102, emp1.getEid());
		
	}

	@Test
	void testUpdate() {
		
		
		Employee emp = new Employee();
		
		emp.setEid(101);
		emp.setEname("Javeed Mohammed");
		emp.setSalary(90000);
		
		
				restTemplate.put(BASE_URL+"/update", emp);
			
			ResponseEntity<Employee>  response =	restTemplate.getForEntity(BASE_URL+"/get/101",Employee.class);
		
					Employee emp1 =	response.getBody();
			
					assertEquals(90000, emp1.getSalary());
	}

	@Test
	void testGetById() {
		
		ResponseEntity<Employee>  response =	restTemplate.getForEntity(BASE_URL+"/get/105",Employee.class);  
		
		Employee emp1 =	response.getBody();

		assertEquals(6500, emp1.getSalary());
		
		
	}

	@Test
	void testDeleteById() {
		
				//restTemplate.delete();
		
	}

	@Test
	void testGetAll() {
		
	}

}
