package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	static private double amount;
	static private String recipientAccountNumber;
	
	private static Scanner s = new Scanner(System.in);
	private static Customer c = new Customer("12345", "Password!1");
	private static Banking banking = new Banking();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Banking Application!");
		
		//authenticate the credentials
		if(isCredentialsOK()) {
			System.out.println("Credentials verified!");

			int choice;
			//display menu
			do {
				displayMenu();
				System.out.println("Enter your choice");
				choice = s.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter the amount to deposit: ");
					amount = s.nextDouble();
					//deposit the money
					banking.deposit(amount);
					break;
				case 2:
					System.out.println("Enter the amount to withdraw: ");
					amount = s.nextDouble();
					//withdraw the money
					banking.withdraw(amount);
					break;
				case 3:
					System.out.println("Enter the amount to transfer: ");
					amount = s.nextDouble();
					System.out.println("Enter recipeint's account number: ");
					recipientAccountNumber = s.next();
					//withdraw the money
					banking.transfer(amount, recipientAccountNumber);
					break;
				case 4:
					System.exit(1);
					break;
				}
			}while(choice != 4);
			
		}
		else {
			System.out.println("Invalid Credentials!");
		}
		
	}
	
	private static boolean isCredentialsOK() {
		System.out.println("Enter your Account Number: ");
		String accountNumber = s.next();
		
		System.out.println("Enter your Account Number: ");
		String password = s.next();
		
		return c.getBankAccountNumber().equals(accountNumber) && c.getPassword().equals(password);
	}
	
	private static void displayMenu() {
		System.out.println("---------------------------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Logout");
		System.out.println("---------------------------------");
	}
}
