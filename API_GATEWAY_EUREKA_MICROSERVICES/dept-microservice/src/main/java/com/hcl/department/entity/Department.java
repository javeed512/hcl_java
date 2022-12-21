package com.hcl.department.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name="department_table")
public class Department {
	
	@Id
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	

}
