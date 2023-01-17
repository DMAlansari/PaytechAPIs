package com.paytech.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.paytech.api.entities.Customers;

@Repository
public interface CustomersRepository extends CrudRepository<Customers,Integer>{

}
