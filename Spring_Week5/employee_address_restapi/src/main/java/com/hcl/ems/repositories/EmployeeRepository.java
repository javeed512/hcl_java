package com.hcl.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ems.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
			public Employee  findByEmpName(String ename);
	
}
