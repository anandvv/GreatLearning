package com.greatlearning.dsa;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		MergeSort ms = new MergeSort();
		ms.sort(array, 0, array.length-1);  // {3 4 2 1 9 8 7}
		ms.printValues(array);
		
		//call ArrayRotation
		int mid = (array.length/2) + 1;
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.leftRotate(array, mid, array.length);
		arrayRotation.printValues(array);
		
		//find the pivot element
		
		System.out.println("Enter the key: ");
		int key = sc.nextInt(); 
				
		ModifiedBinarySearch bs = new ModifiedBinarySearch();
		int keyIndex = bs.pivotedBinarySearch(array, array.length-1, key);
		
		if(keyIndex > 0) {
			System.out.println("Key found at Index: " + keyIndex + 1);
		}
		else {
			System.out.println("Key not found");
		}
		sc.close();
	}
}
