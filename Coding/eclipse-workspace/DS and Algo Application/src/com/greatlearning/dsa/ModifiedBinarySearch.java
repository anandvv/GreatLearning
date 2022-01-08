package com.greatlearning.dsa;

public class ModifiedBinarySearch {

	public int pivotedBinarySearch(int array[], int n, int key) {
		int pivot = findPivotElement(array, 0, n-1);
		
		if(pivot == -1) {
			return binarySearchImplementation(array, 0, n-1, key);
		}
		else if (array[pivot] == key) {
			return pivot;
		}
		else if(array[0] <= key) {
			return binarySearchImplementation(array, 0, pivot-1, key);
		}
		
		return binarySearchImplementation(array, pivot+1, n-1, key);
	}
	
	private int findPivotElement(int arr[], int low, int high) {
		if(high < low) {
			return -1;
		}
		else if(high == low) {
			return low;
		}
		
		int mid = (low+high)/2;
		
		if(mid < high && arr[mid] > arr[mid+1]) {
			return mid;
		}
		else if(mid > low && arr[mid] < arr[mid-1]) {
			return mid-1;
		}
		else if(arr[low] >= arr[mid]) {
			return findPivotElement(arr, low, mid-1);
		}
		
		return findPivotElement(arr, mid+1, high);
	}
	
	public int binarySearchImplementation(int arr[], int low, int high, int key) {
		if(high < low) {
			return -1;
		}
	
		int mid = (low + high)/2;
		
		if (key == arr[mid]) {
			return mid;
		}
		else if(key > arr[mid]){
			return binarySearchImplementation(arr, (mid+1), high, key);
		}
		
		return binarySearchImplementation(arr, low, (mid-1), key);
	}
}