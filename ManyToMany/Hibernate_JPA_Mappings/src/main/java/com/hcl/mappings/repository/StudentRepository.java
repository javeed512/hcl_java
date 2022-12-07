package com.hcl.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mappings.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
