package com.hcl.myapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepoImp implements IRepository {
	
		public RepoImp() {
			
			
			System.out.println("RepoImp obj created..");
			
		}
	
	
	
		public void getRepoData() {
			
			System.out.println("Repo Data is here..");
			
		}
	

}
