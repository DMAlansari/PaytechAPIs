package com.paytech.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.paytech.api.entities.Transactions;

@Repository
public interface TransactionsRepository extends CrudRepository<Transactions,String>{

	List<Transactions> findByAccountNumber(String accountNumber);
}
