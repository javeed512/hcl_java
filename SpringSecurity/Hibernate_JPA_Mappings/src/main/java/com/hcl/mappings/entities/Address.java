package com.hcl.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor



@Entity
//@Table(name="address_table")   // uni-directional one to one and also for onetomany

@Table(name="address_table_m2m")   //manytomany
public class Address {
	
	@Id
	private long  addressId;
	private int  flatNo;
	private String area;
	private String city;
	private long zipcode;
	
	
	// one to many and remember No address property required in student class
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="aid") List<Student> studentList;
	 */

	
	//manytomany   - many 
	
	@ManyToMany(fetch = FetchType.LAZY , mappedBy = "addresses" )
	private Set<Student> students = new HashSet<>();
	
	
	

}
