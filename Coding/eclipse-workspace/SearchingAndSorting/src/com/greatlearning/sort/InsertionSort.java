package com.greatlearning.sort;

import java.util.Scanner;



public class InsertionSort {
	
	static boolean status = false;
	static int[] array;
	static int NUM_ELEMENTS;
	static Scanner sc = new Scanner(System.in);
	static int sortedvalue;

	public void implementationOfInsertionSort() {
		// your code here…

		// Insert values
		insertValues();

		status = checkForStatus();

		do {
			sortValues();

			printValues();

			sortedvalue += 1;

			status = checkForStatus();

		} while (status == false);

	}

 	public void insertValues() {
		
		// Your code here...
		System.out.println("Enter the number of elements: ");
		NUM_ELEMENTS = sc.nextInt();
		
		array = new int[NUM_ELEMENTS];
		
		System.out.println("Enter the elements one line at a time: ");
		
		for(int i=0; i< NUM_ELEMENTS; i++) {
			array[i] = sc.nextInt();
		}
	}

	public void sortValues() {
	
		// your code here...
		for(int i=1; i<array.length-1;i++) {
			int j=i;
			while(j>0 && array[j-1] > array[j]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
			}
		}
	}

	public boolean checkForStatus() { // check if the array is sorted and return boolean value
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] < array[i - 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	 
	
	public void printValues() {
		
		for (int elem : array) {
			System.out.print(elem + " ");
		}
	
	}

	public static void main(String[] args) {
	
		// Your Code here...
		InsertionSort is = new InsertionSort();
		is.implementationOfInsertionSort();
		System.out.println("Sorted List: ");
		is.printValues();
	
	}	


}

