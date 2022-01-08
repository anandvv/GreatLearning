package com.greatlearning.main;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

import java.util.Scanner;

public class Driver {
	
	private static void displayDepartmentMenu() {
		System.out.println("-------------------");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
	
		System.out.println("Choose your department: ");
		displayDepartmentMenu();

		int choice = sc.nextInt();
		
		String department;
		Employee emp;
		
		switch(choice) {
		case 1:
			department = "tech";
			emp = new Employee(firstName, lastName, department);
			break;
		case 2:
			department = "adm";
			emp = new Employee(firstName, lastName, department);
			break;
		case 3:
			department = "hr";
			emp = new Employee(firstName, lastName, department);
			break;
		case 4:
			department = "lg";
			emp = new Employee(firstName, lastName, department);
			break;
		default:
			System.out.println("Invalid Selection");
			sc.close();
			return;
		}

		sc.close();
		
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp);
		String password = cs.generatePassword();
		cs.showCredentials(emp, email, password);
	}
}
