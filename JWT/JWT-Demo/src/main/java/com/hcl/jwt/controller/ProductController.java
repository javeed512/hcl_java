package com.hcl.jwt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/products")
@RestController
public class ProductController {
	
		@PostMapping("/add/{pname}/{price}")
		public String  addProduct(@PathVariable String pname, @PathVariable double price) {
			
			return "Product details: "+pname+" "+price;
			
		}
		
		@GetMapping("/get")
		public List<String> getProducts() {
			
		List<String> list = new ArrayList<String>();
			list.add("Mobile");
			list.add("Laptop");
			list.add("Toys");
			
			return list;
			
			
		}
		
	
	

}
