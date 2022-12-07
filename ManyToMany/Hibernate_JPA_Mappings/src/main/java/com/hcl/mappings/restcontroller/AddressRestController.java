package com.hcl.mappings.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mappings.entities.Address;
import com.hcl.mappings.services.IAddressService;

@RestController
@RequestMapping("/api/address")
public class AddressRestController {

		@Autowired
		IAddressService service;
	
	
	@PostMapping("/add")	
	public Address  addAddress(@RequestBody Address address) {
		
		
			return service.addAddress(address);
		
		
	}
	
	
}
