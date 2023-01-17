package com.paytech.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transactions {

	@Id
	private String  transactionNumber;
	private String  accountNumber;
	private Integer amount;
	private String  description;
	public String getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Transactions() {
		
	}
	public Transactions(String transactionNumber, String accountNumber, Integer amount, String description) {
		super();
		this.transactionNumber = transactionNumber;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.description = description;
	}
	
	
}
