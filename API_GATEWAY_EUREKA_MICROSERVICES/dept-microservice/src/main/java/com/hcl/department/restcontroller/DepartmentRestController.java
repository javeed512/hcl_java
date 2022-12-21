package com.hcl.department.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.department.dto.DepartmentDTO;
import com.hcl.department.entity.Department;
import com.hcl.department.service.IDepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentRestController {
	
		@Autowired
		IDepartmentService service;
	
		@PostMapping("/add")
		public Department  addDept(@RequestBody DepartmentDTO dto) {
			
			
			return service.addDepartment(dto);
			
			
		}
		
		
		@GetMapping("/get/{id}")
		public Department   getDeptById(@PathVariable long id) {
			
			return service.getDeptById(id);
			
			
		}
	
		
		// @PutMapping
		
		
		//@DeleteMapping
	

}
