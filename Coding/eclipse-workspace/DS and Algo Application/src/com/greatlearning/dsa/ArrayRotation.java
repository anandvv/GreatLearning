package com.greatlearning.dsa;

public class ArrayRotation {

	public void leftRotate(int[] array, int mid, int length) {
		int numberOfTimesToRotate = mid;
		
		while(numberOfTimesToRotate > 0) {
			int temp = array[0];
			for(int i=0; i<length-1; i++) {
				array[i] = array[i+1];
			}
			array[length-1] = temp;
			numberOfTimesToRotate--;
		}	
	}
	
	public void printValues(int[] array) {
		
		System.out.println(" ");
		for (int elem : array) {
			System.out.print(elem + " ");
		}
	
	}
}
