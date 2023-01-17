package com.paytech.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paytech.api.dao.CustomersRepository;
import com.paytech.api.entities.Customers;

@Service
public class CustomerService {

	@Autowired
	CustomersRepository repo;
	
	public Optional<Customers> checkId (Integer customerNumber) {
		if(repo.findById(customerNumber).isEmpty()) {
			return null;
		}else {
			System.out.println(repo.findById(customerNumber));
			return repo.findById(customerNumber);
		}
	}
	
	
	
//	public String login (String enteredPassword, Integer customerRimNumber) {
//		
//		System.out.println(repo.findById(customerRimNumber));
//		if(repo.findById(customerRimNumber).isEmpty()) {
//			return "invalid user ID please try again";
//		}
//		else {
//			String[] status= {"",""};
//			status[0]= "user id";
//			status[1]= "true";
//			String username=repo.findById(customerRimNumber).get().getCustomerName();
//			String password=repo.findById(customerRimNumber).get().getPassword();
//			if(password.equalsIgnoreCase(enteredPassword)) {
//				status[0]= "user id & password";
//				status[1]= "true";
//				return "welcome " + username;
//			} else {
//				status[0]= "password";
//				status[1]= "false";
//				return "invalid password!!";
//			}
//		}
//	}
	
	

}

