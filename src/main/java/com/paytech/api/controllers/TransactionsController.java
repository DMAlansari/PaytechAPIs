package com.paytech.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paytech.api.entities.Transactions;
import com.paytech.api.services.TransactionService;

@RestController
public class TransactionsController {
	
	@Autowired
	TransactionService service;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/transaction/get/{accountNumber}")
	 public List<Transactions> getTransactionByAccountId (@PathVariable String accountNumber) { // find all transaction for this account
		return service.getTransactionByAccountId(accountNumber);

}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/transaction/add")
	public void newTransaction (@RequestBody Transactions transaction) {
		 service.newTransaction(transaction);
	}
	}
