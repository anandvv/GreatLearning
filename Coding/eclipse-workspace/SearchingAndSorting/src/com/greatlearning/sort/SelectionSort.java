package com.greatlearning.sort;

import java.util.Scanner;



public class SelectionSort {
	// Your code here...
	static boolean status = false;
	static int[] array;
	static int NUM_ELEMENTS;
	static Scanner sc = new Scanner(System.in);
	
	public void implementationOfSelectionSort() {
		// Your code here...
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
	
	public void sortValues() {
	
		int smallest;
		int smallest_index;
		// Your code here...
		for(int i=0; i<array.length-1; i++) {
			smallest = array[i];
			smallest_index = i;
			//find the smallest element and put it in i-th position
			for(int j=i; j<array.length-1; j++) {
				if(array[j+1] < smallest) {
					smallest = array[j+1];
					smallest_index = j+1;
				}
			}
			//swap
			int temp = array[i];
			array[i] = array[smallest_index];
			array[smallest_index] = temp;
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
		SelectionSort ss = new SelectionSort();
		ss.implementationOfSelectionSort();
		System.out.println("Sorted List: ");
		ss.printValues();
	
	}	
}