package com.training.employeeaddressservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.employeeaddressservice.model.Address;

@FeignClient(value = "addressservice", url="http://localhost:4321")
public interface AddressWebService {
	
	@GetMapping("/address/emp/{employeeId}")
	public Address getAddressByEmployeeId(@PathVariable long employeeId);
	
	@PostMapping("/address")
	public Address addEmployee(Address address);
}
