package com.hcl.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ems.entities.Address;
import com.hcl.ems.repositories.AddressRepository;

@Service
public class AddressServiceImp implements IAddressService {

	@Autowired
	AddressRepository repo;
	
	
	

	@Override
	public Address insertAddress(Address address) {
		// TODO Auto-generated method stub
		return repo.save(address);
	}


	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return repo.save(address);
	}

}
