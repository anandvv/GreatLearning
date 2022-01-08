package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.model.*;

public class CredentialService {
	//generate email address
	public String generateEmailAddress(Employee emp) {
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment().toLowerCase() + ".abc.com";
	}
	
	//generate password
	public String generatePassword() {
		Random random = new Random();
		
		//generate an 8 digit password - capitals, small letters, numbers and special characters
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()";
		
		String allowedCharacters = capitalLetters + smallLetters + numbers + specialCharacters;
		
		//create password
		char[] password = new char[8];
				
		for (int i=0; i<7; i++) {
			int idx = random.nextInt(allowedCharacters.length());
			password[i] = allowedCharacters.charAt(idx);
		}
		
		return new String(password);
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + " - here are your credentials");
		System.out.println("Email Address ---> " + email);
		System.out.println("Password ---> " + password);
	}
}
