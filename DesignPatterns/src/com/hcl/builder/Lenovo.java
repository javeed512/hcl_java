package com.hcl.builder;

public class Lenovo extends  Company {

	
	
	public Lenovo() {
		
		super();// new Company();
	}
	
	
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Lenovo Yoga";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
