package com.hcl.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


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

	
	@ManyToMany(cascade = CascadeType.ALL)  // mappedBy="students"
	//@JoinTable(name = "address_students", joinColumns = { @JoinColumn(name = "studentId") }, inverseJoinColumns = { @JoinColumn(name = "addressId") })
	private Set<Address> addresses = new HashSet<>();	//required to avoid NullPointerException
	
	
	
	
}
