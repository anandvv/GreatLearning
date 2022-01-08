package com.greatlearning.dsa.binarytree.driver;

import java.util.Scanner;

import com.greatlearning.dsa.binarytree.*;

public class Main {

	public static void main(String[] args) {
		//practice 1
		//binaryTreeUsingArray();
		
		//practice 2
		operationsOnBinaryTreeUsingArray();
	}

	private static void templateForPractice() {
		Scanner s = new Scanner(System.in);
		System.out.println("Print the number of elements in the tree: ");
		
		int size = s.nextInt();
		
		BinaryTreeUsingArray btree = new BinaryTreeUsingArray(size);
		
		//add code here
		
		s.close();
	}
	
	private static void operationsOnBinaryTreeUsingArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Print the number of elements in the tree: ");
		
		int size = s.nextInt();
		
		BinaryTreeUsingArray btree = new BinaryTreeUsingArray(size);
		
		//add code here
		boolean flag = true;
		while(flag) {
			System.out.println("\nSelect an option");
			System.out.println("\n1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Print Tree");
			System.out.println("4. Print Tree with parents and children");
			System.out.println("5. Exit");
			
			int option = s.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the number to insert: ");
				int insertValue = s.nextInt();	
				btree.insert(insertValue);
				break;
			case 2:
				System.out.println("Enter the number to delete: ");
				int deleteValue = s.nextInt();
				btree.delete(deleteValue);
				break;
			case 3:
				btree.printTree();
				break;
			case 4:
				btree.printFamily();
				break;
			case 5:
				flag = false;
				break;
			}
		}
		
		s.close();
		
	}

	private static void binaryTreeUsingArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Print the number of elements in the tree: ");
		
		int size = s.nextInt();
		
		BinaryTreeUsingArray btree = new BinaryTreeUsingArray(size);
		
		for (int i = 1; i < size+1; i++) {
			System.out.println("Enter element: ");
			int nextInt = s.nextInt();
			btree.insert(nextInt);
		}
		
		btree.printTree();
		s.close();
	}

}
