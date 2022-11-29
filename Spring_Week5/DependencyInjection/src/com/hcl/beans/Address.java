package com.hcl.beans;

public class Address {
	
	private int aid;
	private String city;
	
	public Address() {
		
		
	}
	

	public Address(int aid, String city) {
		super();
		this.aid = aid;
		this.city = city;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	

}
