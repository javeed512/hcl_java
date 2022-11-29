package com.hcl.myapp.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	private int doorNo;
	private String city;
	

	
	public Address() {
		super();
		
		System.out.println("Address object created..");
		
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
