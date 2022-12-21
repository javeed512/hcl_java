package com.hcl.department.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class DepartmentDTO { // pure pojo class or DTO class
	
	
	
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	

}
