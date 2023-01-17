package com.paytech.api.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paytech.api.dao.AccountsRepository;
import com.paytech.api.entities.Accounts;

@Service
public class AccountService {
	
	@Autowired
	AccountsRepository repo;


	public Integer getBalance(String accountName) {
		return repo.findById(accountName).get().getBalance();
	}

	public Accounts updateBalance(Accounts account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}
}
