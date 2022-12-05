package com.hcl.restapi.service;

import java.util.List;

import com.hcl.restapi.entity.Employee;

public interface IEmployeeService {
	
	
	public  Employee   addEmployee(Employee employee);
	public  Employee   updateEmployee(Employee employee);
	
	
	public Employee  getEmployeeById(long eid);
	public  String     deleteEmployeeById(long eid);
	
	public   List<Employee>  getAllEmployees();
	
	public Employee  getEmployeeByName(String ename);
	
	List<Employee>  getEmployeeBySalary(double salary);
	
	
	List<Employee>  getEmployeesByRange(double low, double high);
	
	
	//public void  deleteByEname(String ename);
	
	
	List<Employee>  getAllSorted();
	
}
