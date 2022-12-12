package com.hcl.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor

@Setter
@Getter
@ToString
@Slf4j

//@Data

@Transactional
@Entity
@Table(name="Employe_Table")
public class Employee {     //Entity class connected to Employee_Table in DB
	
	@Id
	private  long eid;
	
	@Column(name="emp_name")
	private  String ename;
	private   double salary;

}
