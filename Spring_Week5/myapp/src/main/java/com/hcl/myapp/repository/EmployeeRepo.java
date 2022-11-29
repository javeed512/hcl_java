package com.hcl.myapp.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	
	
	JdbcTemplate jdbcTemplate;

	
	public EmployeeRepo(DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
		
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
	

}
