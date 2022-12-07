package com.hcl.mappings.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data


@Entity
@Table(name="student_table")        // uni-directional one to one
public class Student {
	
	@Id
	private long studentId;
	
	private String studentName;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid") // f.k in student table
	private Address address;

}
