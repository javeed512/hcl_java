package com.hcl.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.restapi.entity.Employee;
import com.hcl.restapi.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/api/employees")
@RestController
@Slf4j
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	
	@PostMapping("/add")
	public  Employee   add(@RequestBody Employee employee) {
		
		log.info("add rest api executed..");
		
	return	service.addEmployee(employee);
		
	}
	
	@PutMapping("/update")
	public  Employee   update(@RequestBody Employee employee) {
		
		return service.updateEmployee(employee);
		
	}
	
	//http://localhost:8080/api/employees/get/101
	
	@GetMapping("/get/{eid}")
	public Employee  getById(@PathVariable long eid) {
		
		return service.getEmployeeById(eid);
	}
	
	
	//http://localhost:8080/api/employees/delete/101
	@DeleteMapping("/delete/{eid}")
	public  String     deleteById(@PathVariable long eid) {
		
		return service.deleteEmployeeById(eid);
	}
	
	
	@GetMapping("/getall")
	public   List<Employee>  getAll(){
		
		log.info("All REcords fetch from employee table");
		
		
		return service.getAllEmployees();
		
	}
	
	@GetMapping("/getbyname/{ename}")
	public Employee  getByName(@PathVariable String ename) {
		
		
		return service.getEmployeeByName(ename);
		
	}
	
	@GetMapping("/getbysalary/{salary}")
	List<Employee>  getEmployeeBySalary(@PathVariable double salary){
		
		
		return service.getEmployeeBySalary(salary);
		
	}
	
	
	@GetMapping("/getbyrange/{low}/{high}")
	public List<Employee> getEmployeesByRange(@PathVariable double low, @PathVariable   double high) {
		
		return service.getEmployeesByRange(low, high);
	}

	/*
	 * @DeleteMapping("/deletebyname/{ename}") public void
	 * deleteByEname(@PathVariable String ename) {
	 * 
	 * service.deleteByEname(ename);
	 * 
	 * }
	 */
	
	@GetMapping("/getsorted")
	public List<Employee> getAllSorted() {
		
		
		return service.getAllSorted();
	}
	
}
