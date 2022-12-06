package com.hcl.ems.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Data

@Entity
public class Employee {
	
	@Id  // to make it P.K
	@GeneratedValue(strategy = GenerationType.AUTO)  // for auto generated values of P.K
	private long empId;
	
	private String empName;
	
	private String email;
	
	private String password;

}
