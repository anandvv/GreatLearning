package com.greatlearning.service;
import java.util.Scanner;

public class Banking {
	private static Scanner s = new Scanner(System.in);
	private double balance = 10000.0;
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited Rs." + amount);
			System.out.println("Your balance is Rs." + balance);
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			System.out.println("Successfully withdrew Rs." + amount);
			System.out.println("Your balance is Rs." + balance);
		}
	}
	
	public void transfer(double amount, String recipientbankAccountNumber) {
		//authenticate using OTP
		int generatedOTP = OtpGenerator.generateOTP();
		System.out.println("OTP Generated is " + generatedOTP);
		System.out.println("Enter OTP: " );
		int enteredOTP = s.nextInt();
		if(enteredOTP == generatedOTP) {
			if(amount < balance) {
				balance -= amount;
				System.out.println("Successfully transfered " + amount + " to account number " + recipientbankAccountNumber);
				System.out.println("Account Balance is Rs." + balance);
			}
			else {
				System.out.println("Insufficient balance");
				return;
			}
		}else {
			System.out.println("Authentication failure!");
			return;
		}
	}
}
