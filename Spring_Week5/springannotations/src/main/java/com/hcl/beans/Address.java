package com.hcl.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	private int doorNo;
	private String city;
	

	
	public Address() {
		super();
	}
	public Address(int doorNo, String city) {
		super();
		this.doorNo = doorNo;
		this.city = city;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
