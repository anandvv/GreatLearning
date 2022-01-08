package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		//ask user to enter the size of the transaction array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:\n");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the values of array:\n");
		//enter the values of the array
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		//enter the number of targets that need to be achieved
		System.out.println("Enter the total no of targets that needs to be achieved:\n");
		int numberOfTargets = sc.nextInt();
		
		//check whether the target can be achieved. 
		//If target cannot be achieved the print the message saying given target is not achieved
		while(numberOfTargets > 0) {
			System.out.println("Enter the value of target:\n");
			int target = sc.nextInt();
			int count = 0;
			boolean flag = false;
			
			for(int transaction : array) {
				target -= transaction;
				count++;
				if(target <= 0) {
					flag = true;
					System.out.println("Target achieved after " + count + " transactions");
					break;
				}
			}
			
			if(!flag) {
				System.out.println("Given target is not achieved!");
			}
			numberOfTargets--;		
		}
		
		sc.close();
	}

}
