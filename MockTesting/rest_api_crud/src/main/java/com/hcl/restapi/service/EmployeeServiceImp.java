package com.hcl.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
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

	@Override
	public Employee getEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getEmployeeBySalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalary(salary);
	}

	@Override
	public List<Employee> getEmployeesByRange(double low, double high) {
		// TODO Auto-generated method stub
		return repo.findBySalaryRange(low, high);
	}

	@Override
	public List<Employee> getAllSorted() {
		
		
	//	return repo.findAll(Sort.by("salary"));
		
		//return repo.findAll(Sort.by(Order.desc("ename")));
		
		List<Order> list = new ArrayList<Order>();
		
			list.add(Order.by("salary"));
			list.add(Order.by("ename"));
		
		return repo.findAll(Sort.by(list));
		
	}

	
	  @Override 
	  public void deleteByEname(String ename) {
	  
	  repo.deleteByEname(ename);
	  
	  }
	 

}
