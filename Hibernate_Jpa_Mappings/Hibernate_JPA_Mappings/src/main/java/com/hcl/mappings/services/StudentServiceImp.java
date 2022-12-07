package com.hcl.mappings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mappings.entities.Student;
import com.hcl.mappings.repository.StudentRepository;
@Service
public class StudentServiceImp implements IStudentService {

	@Autowired
	StudentRepository repo;
	
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

}
