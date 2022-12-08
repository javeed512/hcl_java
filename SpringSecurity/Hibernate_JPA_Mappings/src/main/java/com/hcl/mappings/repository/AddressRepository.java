package com.hcl.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mappings.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
