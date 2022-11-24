package com.hcl.cms.service;

import java.util.List;

import com.hcl.cms.beans.User;
import com.hcl.cms.dao.IUserDao;
import com.hcl.cms.dao.UserDaoImp;

public class UserServiceImp implements IUserService {

	private IUserDao dao;
	
	public UserServiceImp() {
		
		dao = new UserDaoImp();
		
	}
	
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}

}
