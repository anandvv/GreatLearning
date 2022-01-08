package com.greatlearning.dsa.binarytree;

public class BinaryTreeUsingArray {
	private int size;
	private int lastIndex = 0;
	int[] tree;
	
	public BinaryTreeUsingArray(int size) {
		this.size = size;
		this.tree = new int[size+1];
	}
	
	public void printTree() {
		int j = 1;
		for(j=1; j<size+1; j++) {
			System.out.print(" " + this.tree[j]);
		}
	}
	
	public void printFamily() {
		for(int j=lastIndex; j>1;j--) {
			if(tree[j] != 0) {
				System.out.println("\nParent of " + tree[j] + " is: " + tree[j/2]);
				
				if(2*j <=lastIndex && tree[2*j] != 0) {
					System.out.println("\tLeft Child of " + tree[j] + " is: "
							+ tree[2*j]);
				}

				if(2*j+1 <=lastIndex && tree[2*j+1] != 0) {
					System.out.println("\tRight Child of " + tree[j] + " is: "
							+ tree[2*j+1]);
				}

			}
		}
	}

	public void insertValue(int nextInt, int index) {
		tree[index] = nextInt;
	}

	public void insert(int nextInt) {
		if(!isFull()) {
			tree[++lastIndex] = nextInt;
		}else {
			System.out.println("Tree is full!");
		}
	}
	
	public void delete(int numberToDelete) {
		
		//if the tree is empty, there's nothing to do here
		if(lastIndex == 0) {
			System.out.println("Tree is Empty!");
			return;
		}
		
		boolean found = false;
		int i=1;
		
		while(!found && i<=size) {
			if(tree[i] == numberToDelete) {
				found = true;
				//replace delete index value with last insertValue
				tree[i] = tree[lastIndex];
				//set last value to 0 and decrement lastIndex
				tree[lastIndex--] = 0;
				continue;
			}
			
			i++;
		}
	}

	private boolean isFull() {
		if(tree[size] != 0) {
			return true;
		}
		
		return false;
	}
}
