package com.hcl.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.myapp.repository.IRepository;

@Service
public class ServiceImp implements IService {

	@Autowired
	IRepository	repo;
	
	
	public ServiceImp() {
		
		
		System.out.println("Service obj created..");
	}
	
	
	public void getService() {
		
		
		System.out.println("Service executed and call repo data");
		
		repo.getRepoData();
		
		
		
	}
	
	
}
