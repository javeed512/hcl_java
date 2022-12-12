package com.hcl.restapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.hcl.restapi.dao.EmployeeDao;
import com.hcl.restapi.entity.Employee;


class EmployeeManagerServiceTest {
	
		@Spy
		List list = new ArrayList<String>();
	
		@Mock
		EmployeeDao dao;
	
		@InjectMocks
		EmployeeManagerService service;
		
		
		
		
		@BeforeEach
		public void init() {
			
				
			MockitoAnnotations.initMocks(this);
			
		}
		

	@Test
	void testGetEmployeeList() {
		
		
		List<Employee> list = new ArrayList<Employee>();
		
			list.add(new Employee(301, "Keerthan", 40000));
			list.add(new Employee(302, "Monica", 50000));
			list.add(new Employee(303, "Aswini", 60000));
		
		
			when(dao.getEmployeeList()).thenReturn(list);
			
			
	List<Employee>	 empList =	service.getEmployeeList();
		
		
		assertEquals(3, empList.size());
		
		verify(dao,times(1)).getEmployeeList();
	
			
			
	}

	@Test
	void testGetEmployeeById() {
		
		
		when(dao.getEmployeeById(305)).thenReturn(new Employee(305, "Charan", 80000));
		
		Employee newEmp =	service.getEmployeeById(305);
		
		assertEquals("Charan", newEmp.getEname());
		
		
	}

	@Test
	void testAddEmployee() {
		
		Employee emp = new Employee(304, "Javeed", 30000);
		
		service.addEmployee(emp);
		
		verify(dao,times(1)).addEmployee(emp);
		
		
	}

	@Test
	void testDeleteEmployee() {
		
		
		service.deleteEmployee(306);
		
		verify(dao,times(1)).deleteEmployee(306);
		
		
	}

}
