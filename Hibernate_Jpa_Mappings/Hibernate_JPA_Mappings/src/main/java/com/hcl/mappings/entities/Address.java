package com.hcl.mappings.entities;

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
@Table(name="address_table")   // uni-directional one to one
public class Address {
	
	@Id
	private long  addressId;
	private int  flatNo;
	private String area;
	private String city;
	private long zipcode;
	
	


}
