package com.hcl.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.department.dto.DepartmentDTO;
import com.hcl.department.entity.Department;
import com.hcl.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements IDepartmentService {

	@Autowired
	DepartmentRepository repo;

	@Override
	public Department addDepartment(DepartmentDTO deptDTO) {
		
		
		
		// validations methods true , ok
		
		Department department  = new Department();
		
					department.setDepartmentId(deptDTO.getDepartmentId());
					department.setDepartmentName(deptDTO.getDepartmentName());
					department.setDepartmentAddress(deptDTO.getDepartmentAddress());
					department.setDepartmentCode(deptDTO.getDepartmentCode());
		
		
		
		
		return repo.save(department);
				
	
	}

	@Override
	public Department getDeptById(long id) {
		
		return repo.findById(id).orElse(null);
	}

}
