package com.hcl.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.restapi.dao.EmployeeDao;
import com.hcl.restapi.entity.Employee;

@Service
public class EmployeeManagerService {
	
	
	@Autowired
	EmployeeDao dao;
	
	public List<Employee> getEmployeeList() {
		return dao.getEmployeeList();
	}

	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public Employee addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}
	
	public Employee deleteEmployee(int id) {
		
	 return		dao.deleteEmployee(id);
	}
	
	
	

}
