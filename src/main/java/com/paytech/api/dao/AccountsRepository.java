package com.paytech.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.paytech.api.entities.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts,String> {

	Optional<Accounts> findById(String accountName); // the crud repo is the one that has all the methods
	                                                                          // such as get, get all etc

}
