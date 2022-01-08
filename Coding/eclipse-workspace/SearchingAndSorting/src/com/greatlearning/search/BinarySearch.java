package com.greatlearning.search;
import java.util.Scanner;

public class BinarySearch {

	static int[] searchArray;
	final static int SEARCH_VALUE = 38;
	static Scanner sc = new Scanner(System.in);
	
	public void implementationOfBinarySearch() {
		insertValues();
		searchValue();
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

	public void searchValue() {
	
		int first = 0;
		int last = searchArray.length - 1;
		int mid = (first + last)/2;
		
		while(first < last) {
			if(SEARCH_VALUE < searchArray[mid]) {
				//search left side of array
				last = mid - 1;
			}else if(SEARCH_VALUE == searchArray[mid]) {
				//element found
				System.out.println(SEARCH_VALUE + " found at index " + mid);
				break;
			} else {
				//search right side of array
				first = mid + 1;
			}
			mid = (first + last)/2;
		}
		
		if(first >= last) {
			System.out.println(SEARCH_VALUE + " not found!");
		}
	
	}

	public static void main(String[] args) {
	
		// Your code here...
		BinarySearch bs = new BinarySearch();
		bs.implementationOfBinarySearch();
	}

}