package com.hcl.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hcl.ems.entities.Employee;
import com.hcl.ems.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public ResponseEntity<String> registerEmployee(Employee employee) {

		ResponseEntity<String> response = null;

		Employee emp = repo.save(employee);

		if (emp != null) {

			response = new ResponseEntity<String>("Employee Registration done Successfully", HttpStatus.ACCEPTED);

		} else {

			response = new ResponseEntity<String>("Employee Registration Failed", HttpStatus.NOT_ACCEPTABLE);

		}

		return response;

	}

	@Override
	public Employee getEmployeeByName(String empName) {
		
		
		
		return repo.findByEmpName(empName);
	}

}
