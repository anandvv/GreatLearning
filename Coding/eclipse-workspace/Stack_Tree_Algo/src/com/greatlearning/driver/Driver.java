package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the brackets string to balance:");
		
		String input = sc.next();
		
		if(BalancingBrackets.bracketExpression(input)) {
			System.out.println("Balanced!");
		}else {
			System.out.println("Not Balanced!");
		}
		
		sc.close();
	}

}
