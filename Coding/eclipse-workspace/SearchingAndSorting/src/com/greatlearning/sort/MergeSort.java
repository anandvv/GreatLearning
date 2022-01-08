package com.greatlearning.sort;

import java.util.Scanner;



public class MergeSort {
	
	static boolean status = false;
	static int[] array;
	static int NUM_ELEMENTS;
	static Scanner sc = new Scanner(System.in);

	public void implementationOfMergeSort() {

		// Insert values
		insertValues();

		sortArray(array, 0, array.length-1);

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

	public void sortArray(int a[], int l, int r) {
	
		// your code here...
		int mid = (l+r)/2;
		
		if(l < r) {
			sortArray(a, l, mid);
			sortArray(a, mid+1, r);
		}
		
		merge(a, l, mid, r);
	}
	
	void merge(int[] a, int l, int mid, int r) {

		int len1 = mid - l + 1;
		int len2 = r - mid;
		
		int leftArray[] = new int[len1];
		int rightArray[] = new int[len2];
		
		for(int i=0;i<len1;i++) {
			leftArray[i] = a[l+i];
		}
		
		for(int j=0;j<len2;j++) {
			rightArray[j] = a[mid+1 + j];
		}
		
		int i,j,k;
		i=0;
		j=0;
		k=l;
		
		while(i < len1 && j < len2) {
			if(leftArray[i] <= rightArray[j]) {
				a[k++] = leftArray[i++];
			}else {
				a[k++] = rightArray[j++];
			}
		}
		
		while(i < len1) {
			a[k++] = leftArray[i++];
		}
		
		while(j < len2) {
			a[k++] = rightArray[j++];
		}
	}

	public void printValues() {
		
		for (int elem : array) {
			System.out.print(elem + " ");
		}
	
	}

	public static void main(String[] args) {
	
		// Your Code here...
		MergeSort ms = new MergeSort();
		ms.implementationOfMergeSort();
		System.out.println("Sorted List: ");
		ms.printValues();
	
	}	


}

