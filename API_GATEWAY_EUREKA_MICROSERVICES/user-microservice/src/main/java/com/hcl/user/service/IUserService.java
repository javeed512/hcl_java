package com.hcl.user.service;

import com.hcl.user.dto.UserDTO;
import com.hcl.user.entity.User;
import com.hcl.user.vo.UserDeptVO;

public interface IUserService {

	
	public User  addUser(UserDTO dto);
	
	public User  getUserById(long uid);
	
	public		UserDeptVO	 getUserByIdWithDept(long uid);
	
}
