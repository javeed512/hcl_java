package com.hcl.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data


@Entity
//@Table(name="student_table")     // uni-directional one to one


//@Table(name="student_table_mo")  // manytoone  or  onetomany  


@Table(name="student_table_m2m")  // manytomany
public class Student {
	
	@Id
	private long studentId;
	
	private String studentName;
	
	
	//@OneToOne(cascade = CascadeType.ALL)  // onetoone demo , just replace below code with @OnetoOne annotation
	
	
	//ManytoOne no collections only single property for opp class
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "aid")                        
	 * 
	 * private Address address;
	 */

	
	@ManyToMany(cascade = CascadeType.ALL )
	//@JoinTable(name = "address_students", joinColumns = { @JoinColumn(name = "sid") }, inverseJoinColumns = { @JoinColumn(name = "aid") })
	private Set<Address> addresses = new HashSet<>();	//required to avoid NullPointerException
	
	
	
	
}
