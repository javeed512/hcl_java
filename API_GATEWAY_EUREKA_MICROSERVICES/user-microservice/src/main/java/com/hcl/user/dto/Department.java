package com.hcl.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Department { // POJO class 
	

	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	

}
