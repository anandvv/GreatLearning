package com.greatlearning.sort;
import java.util.*;

public class RadixSort {
	
	static int getMax(int[] arr) {
		int largest = Integer.MIN_VALUE;
		
		//find the largest element
		for(int elem : arr) {
			if(elem > largest) {
				largest = elem;
			}
		}
		
		return largest;
		
	}
	
	//sort the array using counting sort according to the digit represented
	//by exp
	private void countSort(int[] array, int exp) {
		
		int[] output = new int[array.length];
		int i = 0;
		int[] count = new int[10];
		Arrays.fill(count, 0); //initialize array elements to 0
		
		//store the count of occurences in count
		for(i=0; i<array.length; i++) {
			count[(array[i]/exp) % 10]++;
		}
		
		//compute cumulative count
		for(i=1; i<10; i++) {
			count[i] += count[i-1];
		}
		
		//build the output array
		for(i=array.length-1; i>=0; i--) {
			output[count[(array[i]/exp)%10]-1] = array[i];
			count[(array[i]/exp)%10]--;
		}
		
		//copy the output array to array[]
		for(i=0; i<array.length; i++) {
			array[i] = output[i];
		}
	}

	void sort(int[] array) {
		int m = getMax(array);
		
		for(int exp=1; m/exp > 0; exp*=10) {
			countSort(array, exp);
		}
	}
	
	//this drives the application
	public static void main(String[] args) {
		//insert values
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int NUM_ELEMENTS = sc.nextInt();
		
		int[] array = new int[NUM_ELEMENTS];
		
		System.out.println("Enter the elements one line at a time: ");
		
		for(int i=0; i< NUM_ELEMENTS; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		RadixSort rs = new RadixSort();
		rs.sort(array);
		
		//print values
		System.out.println("Sorted elements:");
		for(int elem : array) {
			System.out.print(elem + " ");
		}
	}
}
