package com.hcl.cms.beans;

public class Contact {
	
	private long contactNumber;
	private String contactName;
	private  String email;
	private String address;
	
	
	
	
	public Contact() {
		
		
		
	}
	
	
	
	public Contact(long contactNumber, String contactName, String email, String address) {
		super();
		this.contactNumber = contactNumber;
		this.contactName = contactName;
		this.email = email;
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [contactNumber=" + contactNumber + ", contactName=" + contactName + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
	
	
	

}
