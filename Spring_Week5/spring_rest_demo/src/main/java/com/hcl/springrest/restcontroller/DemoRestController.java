package com.hcl.springrest.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springrest.beans.User;

@RequestMapping("/api/demo")
@RestController
public class DemoRestController {

	@GetMapping("/get")
	public String  getData() {
		
		User user = new User();
		
		user.setUid(101);
		user.setUsername("javeed");
		
		return "Welcome to SPRING REST API ";
		
		
	}
	
	@PostMapping("/add")
	public String  postData() {
		
		
		return "data posted..";
		
	} 
	
	
	@PutMapping("/update")
	public String  updateData() {
		
		
		return "data updated..";
		
	} 
	
	@DeleteMapping("/delete")
	public String  removeData() {
		
		
		return "data deleted..";
		
	} 
	
	
	
}
