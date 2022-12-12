package com.hcl.restapi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hcl.restapi.entity.Employee;

@Repository
public class EmployeeDao {
	
	private Map<Long, Employee> DB = new HashMap<>();

	public List<Employee> getEmployeeList()
	{
		List<Employee> list = new ArrayList<>();
		if(list.isEmpty()) {
			list.addAll(DB.values());
		}
		return list;
	}

	public Employee getEmployeeById(int id) {
		return DB.get(id);
	}

	public Employee addEmployee(Employee employee) {
		employee.setEid(DB.keySet().size() + 1);
		return DB.put(employee.getEid(), employee);
	}

	public Employee updateEmployee(Employee employee) {
		return DB.put(employee.getEid(), employee);
	}

	public Employee deleteEmployee(int id) {
		return DB.remove(id);
	}
	
	
	

}
