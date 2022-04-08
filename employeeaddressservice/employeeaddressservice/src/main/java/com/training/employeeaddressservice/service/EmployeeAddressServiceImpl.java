package com.training.employeeaddressservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.employeeaddressservice.model.Address;
import com.training.employeeaddressservice.model.Employee;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {

	@Autowired
	EmployeeWebService empWebSevice;

	@Autowired
	AddressWebService addressWebService;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> empList = empWebSevice.getEmployees();
		System.out.println();
		for (Employee employee : empList) {
			employee.setAddress(addressWebService.getAddressByEmployeeId(employee.getId()));
		}
		return empList;
	}

	@Override
	public Employee addEmployeeAddress(Employee employee) {
		employee.setAddress(addressWebService.addEmployee(employee.getAddress()));
		return employee;
	}

}
