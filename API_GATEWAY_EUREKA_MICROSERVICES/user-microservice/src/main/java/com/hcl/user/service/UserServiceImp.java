package com.hcl.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hcl.user.dto.Department;
import com.hcl.user.dto.UserDTO;
import com.hcl.user.entity.User;
import com.hcl.user.repository.UserRepository;
import com.hcl.user.vo.UserDeptVO;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public User addUser(UserDTO dto) {
		
		// input validations
		
		User user = new User();
		
			user.setUserId(dto.getUserId());
			user.setUserName(dto.getUserName());
			user.setEmail(dto.getEmail());
			user.setDepartmentId(dto.getDepartmentId());
		
		
		return repo.save(user);
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).orElse(null);
		
	
	}

	@Override
	public UserDeptVO getUserByIdWithDept(long uid) {


			User user =		getUserById(uid);
			
			long deptId =	user.getDepartmentId();
			
			
			System.out.println(deptId);
			
			
//Department dept =  restTemplate.getForObject("http://localhost:8081/api/departments/get/"+deptId,Department.class);

ResponseEntity<Department> response = restTemplate.getForEntity("http://API-GATEWAY/api/departments/get/"+deptId,Department.class );
				
			Department dept = 	response.getBody();
			
			
			System.out.println(dept);
		
				UserDeptVO userDept = new UserDeptVO(user, dept);

					System.out.println(userDept);
		
		return userDept;
	}
	
	
	//deleteDeptByUser(long uid);
	
	

}
