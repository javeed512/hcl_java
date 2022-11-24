package com.hcl.cms.service;

import java.util.List;

import com.hcl.cms.beans.User;

public interface IUserService {
	
	
	public int addUser(User user);  // new user registration
	
	public List<User>  getAllUser(); // fetch all user from database
	

}
