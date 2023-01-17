package com.paytech.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.paytech.api.entities.Customers;
import com.paytech.api.services.CustomerService;

@RestController
public class CustomersController {
	
	@Autowired 
	CustomerService service;
	
//	@GetMapping("/Customers/login/{password}/{customerRimNumber}")
//	public String[] login(@PathVariable String password,@PathVariable Integer customerRimNumber) {
//		return service.login(password, customerRimNumber);
//		
//	}
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/Customers/checkId/{customerRimNumber}")
	public  Optional<Customers> checkId (@PathVariable Integer customerRimNumber) {
		return service.checkId (customerRimNumber);
		
	}
	
//	@GetMapping("/Customers/login/{password}/{customerRimNumber}")
//	public String login(@PathVariable String password,@PathVariable Integer customerRimNumber) {
//		return service.login(password, customerRimNumber);
//		
//	}

//	@GetMapping("/Customers/name/{customerRimNumber}")
//	public String getCustomerName(@PathVariable Integer customerRimNumber) {
//		return service.getCustomerName(customerRimNumber);
//	}
//	
//	@GetMapping("/Customers/password/{customerRimNumber}")
//	public String gePaswword(@PathVariable Integer customerRimNumber) {
//		return service.getPassword(customerRimNumber);
//	}

}
