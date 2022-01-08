package com.greatlearning.sort;

import java.util.Scanner;

public class BubbleSort {

	static int array[];
	
	static int NUM_ELEMENTS, temp, len, i, j;
	
	static boolean status = false;
	
	Scanner sc = new Scanner(System.in);

	public void implmentationOfBubbleSort() {

		// Your Code here...
		// Insert values
		insertValues();

		// Sort values();
		do {
			sortValues();
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


	public boolean checkForStatus() { // check if the array is sorted and return boolean value
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] < array[i - 1]) {
				return false;
			}
		}
		
		return true;
	}
 

	public void sortValues() {
	
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					//swap
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public void printValues() {
	
		for (int elem : array) {
			System.out.print(elem + " ");
		}
	
	}

	public static void main(String[] args) {
	
		// Your Code here...
		BubbleSort bs = new BubbleSort();
		bs.implmentationOfBubbleSort();
		System.out.println("Sorted List: ");
		bs.printValues();
	
	}

}
