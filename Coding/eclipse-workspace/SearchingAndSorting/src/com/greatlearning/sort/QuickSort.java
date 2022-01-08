package com.greatlearning.sort;
import java.util.*;

public class QuickSort {
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j=low; j<=high-1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
	}
	
	private void sort(int[] array, int low, int high) {
		if(low < high) {
			int p_index = partition(array, low, high);
			//System.out.println(Arrays.toString(array));
			sort(array, low, p_index-1);
			sort(array, p_index+1, high);
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
		
		QuickSort qs = new QuickSort();
		qs.sort(array, 0, array.length - 1);
		
		//print values
		System.out.println("Sorted elements:");
		for(int elem : array) {
			System.out.print(elem + " ");
		}
	}
}
