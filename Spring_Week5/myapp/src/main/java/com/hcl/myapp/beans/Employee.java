package com.hcl.myapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
//@Scope("prototype")
//@Qualifier("emp1")
public class Employee {
	
	
	private int eid;
	private String ename;
	
	
	@Autowired
	private Address address;
	
	
	public Employee() {
		
		System.out.println("Employee object created..");
	}
	
	
	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		
		System.out.println("setAddress() called to inject address obj into emp obj");
	}
	
	
	
	
	
	
	
	
	

}
