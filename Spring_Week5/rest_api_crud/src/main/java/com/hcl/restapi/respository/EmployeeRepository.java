package com.hcl.restapi.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.restapi.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

	Employee findByEname(String ename);
	
	List<Employee>  findBySalary(double salary);
	
	@Query("select e from Employee e  where salary between ?1 and ?2 order by ename asc")
	List<Employee> findBySalaryRange(double low,double high);
	
	/*
	 * @Modifying
	 * 
	 * @Query("delete Employee e where e.ename = ?1") public void
	 * deleteByEname(String ename);
	 */
	
	
}
