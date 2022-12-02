package com.hcl.restapi.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.restapi.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}
