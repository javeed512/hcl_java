package com.hcl.mappings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mappings.entities.Address;
import com.hcl.mappings.repository.AddressRepository;

@Service
public class AddressServiceImp implements IAddressService {

	
	@Autowired
	AddressRepository repo;
	
	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return repo.save(address);
	}

}
