package com.hcl.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.security.entity.User;
import com.hcl.security.repository.UserRepository;

@Service
public class MyUserDetailsServiceImp implements UserDetailsService {

	
		@Autowired
		UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user =		repo.findByUsername(username);
			
				if(user == null) {
					
					
					throw  new UsernameNotFoundException("User Not Found 404");
					
				}
				
		UserDetails userDetails = new UserDetailsImp(user);
		
		return userDetails;
	}

}
