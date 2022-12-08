package com.hcl.mappings.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mappings.entities.Student;
import com.hcl.mappings.services.IStudentService;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

		@Autowired
		IStudentService service;
	
	
		@PostMapping("/add")
		public Student  addStudent(@RequestBody Student student) {
			
			
			return service.addStudent(student);
			
		}
	
	
}
