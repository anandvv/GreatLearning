package com.greatlearning.dsa;

public class MergeSort {
	
	public void sort(int arr[], int left, int right) {
	
		// your code here...
		int mid = (left+right)/2;
		
		if(left < right) {
			sort(arr, left, mid);
			sort(arr, mid+1, right);
		}
		
		merge(arr, left, mid, right);
	}
	
	private void merge(int[] arr, int left, int mid, int right) {

		//find the sizes of the two sub arrays (left and right)
		int len1 = mid - left + 1;
		int len2 = right - mid;
		
		//create temporary arrays
		int leftArray[] = new int[len1];
		int rightArray[] = new int[len2];
		
		//copy data to these temporary arrays
		for(int i=0; i<len1; i++) {
			leftArray[i] = arr[left+i];
		}
		
		for(int j=0; j<len2; j++) {
			rightArray[j] = arr[mid+1 + j];
		}
		
		
		//merge the arrays
		int i,j,k;
		i=0;
		j=0;
		k=left;
		
		while(i < len1 && j < len2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			}else {
				arr[k++] = rightArray[j++];
			}
		}
		
		while(i < len1) {
			arr[k++] = leftArray[i++];
		}
		
		while(j < len2) {
			arr[k++] = rightArray[j++];
		}
	}

	public void printValues(int[] array) {
		
		System.out.println(" ");
		for (int elem : array) {
			System.out.print(elem + " ");
		}
	
	}
}

