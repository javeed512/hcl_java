package com.hcl.cms.dao;

import java.util.List;

import com.hcl.cms.beans.User;

public interface IUserDao {
	

	public int addUser(User user);  // new user registration
	
	public List<User>  getAllUser(); // fetch all user from database
	

}
