package com.hcl.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.service.ShoppingCart;

public class AopDemo {

	public static void main(String[] args) {


		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	ShoppingCart  cart = context.getBean(ShoppingCart.class);
		
		cart.addProduct("Mobile Phone");
	
		
		cart.checkout();
		
		System.out.println("==================");
		
		cart.bookingStatus(101);
	
	}

}
