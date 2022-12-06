package com.hcl.ems.services;

import org.springframework.http.ResponseEntity;

import com.hcl.ems.entities.Employee;

public interface IEmployeeService {
	
	
	public ResponseEntity<String>  registerEmployee(Employee employee);
	
	public    Employee   getEmployeeByName(String empName); 

}
