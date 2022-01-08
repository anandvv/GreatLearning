package com.greatlearning.search;
import java.util.*;

public class LinearSearch {

	final static int SEARCH_ELEMENT = 15;
	static Scanner sc = new Scanner(System.in);
	int[] searchArray;
	
	public void implementationOfLinearSearch() {
		insertValues();
		printValues();
		searchValue(SEARCH_ELEMENT);
	}

 	public void insertValues() {
	
		// Your code here...
		System.out.println("Enter the number of elements: ");
		int numberOfElements = sc.nextInt();
		
		searchArray = new int[numberOfElements];
		
		System.out.println("Enter the elements one line at a time: ");
		
		for(int i=0; i< numberOfElements; i++) {
			searchArray[i] = sc.nextInt();
		}
	
	}

 

	public void printValues() {
	
		System.out.println("Elements of the array: ");
		for(int element : searchArray) {
			System.out.println(element);
		}
	
	}

 

	public void searchValue(int value) {
	
		int index = 0;
		
		for(int i=0;i<searchArray.length;i++) {
			if(searchArray[i] == value) {
				System.out.println("Element found at Index " + i);
				return;
			}
		}
		
		System.out.println(value + " not found!");
	
	}

	public static void main(String[] args) { 
	
		LinearSearch linearsearch = new LinearSearch();
	
		linearsearch.implementationOfLinearSearch();
	
	}

}
