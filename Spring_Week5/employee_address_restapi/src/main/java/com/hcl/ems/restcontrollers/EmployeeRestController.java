package com.hcl.ems.restcontrollers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ems.entities.Employee;
import com.hcl.ems.services.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
	@Autowired
	IEmployeeService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<String>  register(@RequestBody Employee employee){
		
		return service.registerEmployee(employee);
		
	}
	
	@GetMapping("/login/{empName}/{password}")
	public    ResponseEntity<String>   login(@PathVariable  String empName,@PathVariable String password,HttpSession session) {
		
		
		Employee employee =		service.getEmployeeByName(empName);
		
		
		log.info("login() called "+employee);
		
		ResponseEntity<String>  response = null;
		
			if(employee.getEmpName().equals(empName) && employee.getPassword().equals(password)) {
				
				session.setAttribute("empName", empName);
				session.setAttribute("password", password);
				
				response = new ResponseEntity<String>("Login Success!",HttpStatus.OK);
				
			}
			
			else{
				response = new ResponseEntity<String>("Login Fail!",HttpStatus.BAD_REQUEST);
				
				
			}
			
			return response;
		
		
	}

	
		@GetMapping("/logout")
		public  String   logout(HttpSession session) {
			
			
				session.invalidate();
				
			
				return "Logout Success";
			
			
		}
	
	
	

}
