package com.hcl.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
