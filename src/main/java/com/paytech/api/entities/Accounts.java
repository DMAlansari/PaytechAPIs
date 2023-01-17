package com.paytech.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	private String  accountName;
	private Integer customerRimNumber;
	private Integer balance;
	public String getAccountNumber() {
		return accountName;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountName = accountNumber;
	}
	public Integer getCustomerRimNumber() {
		return customerRimNumber;
	}
	public void setCustomerRimNumber(Integer customerRimNumber) {
		this.customerRimNumber = customerRimNumber;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Accounts() {
		
	}
	public Accounts(String accountNumber, Integer customerRimNumber, Integer balance) {
		super();
		this.accountName = accountNumber;
		this.customerRimNumber = customerRimNumber;
		this.balance = balance;
	}
	


}
