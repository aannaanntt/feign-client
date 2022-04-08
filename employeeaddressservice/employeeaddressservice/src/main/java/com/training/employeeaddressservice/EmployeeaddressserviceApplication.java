package com.training.employeeaddressservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeaddressserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeaddressserviceApplication.class, args);
	}

}
