package com.hcl.ems.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ems.entities.Address;
import com.hcl.ems.services.IAddressService;

@RestController
@RequestMapping("/api/address")
public class AddressRestController {
	
	@Autowired
	IAddressService service;
	

		@PostMapping("/insert")
		public Address   insert(@RequestBody Address address) {
			
			return service.insertAddress(address);
			
			
		}
		
		
		@PutMapping("/update")
		public Address   update(@RequestBody Address address) {
			
			return service.updateAddress(address);
			
			
		}
	
	
	
	
}
