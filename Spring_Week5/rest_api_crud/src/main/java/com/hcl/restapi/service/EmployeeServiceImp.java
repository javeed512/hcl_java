package com.hcl.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.restapi.entity.Employee;
import com.hcl.restapi.respository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);  // return void
		
		return "Record Deleted Successfully..";
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
