package com.paytech.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.paytech.api.entities.Accounts;
import com.paytech.api.services.AccountService;




@RestController
public class AccountsController {
	
	@Autowired
	AccountService service;
	
	
//	@GetMapping("/accounts/login")
//	public String[] login(@RequestBody String password, Integer customerRimNumber) {
//		return service.login(password , customerRimNumber);
//	}
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/accounts/balance/{id}")
	public Integer getBalance(@PathVariable String id) {
		 return service.getBalance(id);
	}
	@CrossOrigin(origins="http://localhost:4200")
	@PutMapping("/accounts/balance/{id}")
	public void updateBalance(@PathVariable Integer id ,@RequestBody Accounts account){
		 service.updateBalance(account);
	}
	

	
}