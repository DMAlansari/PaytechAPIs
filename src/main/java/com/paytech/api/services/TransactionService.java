package com.paytech.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paytech.api.dao.TransactionsRepository;
import com.paytech.api.entities.Transactions;


@Service
public class TransactionService {

	@Autowired
	TransactionsRepository repo;
	//findAll findes by primary key of the table
	public List<Transactions> getTransactionByAccountId (String accountNumber) {
		return repo.findByAccountNumber(accountNumber);
	}
	
	public void updateTransactionByAccountNumber (Transactions transaction) {
		 repo.save(transaction);
	}
	
	public void newTransaction(Transactions transaction) {
		 repo.save(transaction);
	}
	
	
	
}
