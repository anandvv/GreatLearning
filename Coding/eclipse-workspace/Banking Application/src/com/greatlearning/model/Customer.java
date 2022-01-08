package com.greatlearning.model;

public class Customer {
	
	private String bankAccountNumber;
	private String password;
	
	public Customer(String bankAccountNumber, String password) {
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
	}
	
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
