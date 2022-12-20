package com.hcl.user.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.user.dto.UserDTO;
import com.hcl.user.entity.User;
import com.hcl.user.service.IUserService;
import com.hcl.user.vo.UserDeptVO;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User  addUser(@RequestBody UserDTO dto){
		
		
		return service.addUser(dto);
		
	}
	
	
	@GetMapping("/get/{uid}")
	public User  getUserById(@PathVariable long uid) {
		
		return service.getUserById(uid);
		
	}
	
	@GetMapping("/get-user-dept/{uid}")
	public		UserDeptVO	 getUserByIdWithDept(@PathVariable long uid) {
		
			return service.getUserByIdWithDept(uid);
		
	}
	
	

}
