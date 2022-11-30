package com.hcl.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCart {

	public void addProduct(String productName) {

		System.out.println("Product added successfully " + productName);

	}

	public void checkout() {

				//logging
				//authentication , authorization
				// transaction management
		
		System.out.println("Checkout success , checkout() called..");

	}

	public String bookingStatus(int cid) {

		return "Booking Success for "+cid;

	}

}
