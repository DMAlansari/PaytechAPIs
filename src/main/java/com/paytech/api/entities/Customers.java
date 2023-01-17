package com.paytech.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customers {
	@Id
	private Integer customerRimNumber;
	private String  customerName;
	private String  password;
	
	public Integer getCustomerRimNumber() {
		return customerRimNumber;
	}
	public void setCustomerRimNumber(Integer customerRimNumber) {
		this.customerRimNumber = customerRimNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Customers() {
		
	}

	public Customers(Integer customerRimNumber, String customerName, String password) {
		super();
		this.customerRimNumber = customerRimNumber;
		this.customerName = customerName;
		this.password = password;
	}
	
	

}
