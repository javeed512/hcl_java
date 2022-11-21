package com.hcl.crud.pojo;

import java.time.LocalDate;

public class Product {

	private int pid;
	private String pname;
	private double price;
	private LocalDate dop;
	
	public Product() {
		
		
	}
	
	// param-constructors will help us to set  all values to the pojo objects

	public Product(int pid, String pname, double price, LocalDate dop) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.dop = dop;
	}

	// each getter method help us to get single value from pojo object
	// here get pid value
	public int getPid() {
		return pid;
	}

	// each setter method help us to set single value to the pojo object
	// set pid value
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDop() {
		return dop;
	}

	public void setDop(LocalDate dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
