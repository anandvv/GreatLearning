package com.greatlearning.dsa.binarytree;

public class BinarySearchTree {
	Node root;
	
	//default constructor
	public BinarySearchTree() {
		root = null;
	}
	
	private void insertRec(Node root, int number) {
		Node newNode = new Node();
		newNode.key = number;
		newNode.left = null;
		newNode.right = null;
		
		//empty BST
		if(root == null) {
			root = newNode;
			return;
		}
		
		//if number less than root, insert in the left subtree
		if(number < root.key) {
			insertRec(root.left, number);
		}else if(number > root.key) { //if number greater than root, insert in the right subtree
			insertRec(root.right, number);
		}
	}
	
	private Node deleteRec(Node root, int key) {
		//if the tree is empty
		if(root == null) {
			return root;
		}
		
		//otherwise recurse down the subtree
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}else {
			//node with only left child or no child
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}
			
			//get the inorder successor and set it's value to root's key
			root.key = minValue(root.right);
			
			//delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}
		
		return root;
		
	}
	
	private int minValue(Node root) {
		int minv = root.key;
		
		while(root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		
		return minv;
	}
	
	//Prints the tree content using InOrderTraversal
	private void inOrderTraversalRec(Node root) {
		if(root == null) return;
		
		inOrderTraversalRec(root.left);

		System.out.println(root.key);
		
		inOrderTraversalRec(root.right);
	}
	
	public void insert(int key) {
		insertRec(root, key);
	}
	
	public void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	public void inOrderTraversal() {
		inOrderTraversalRec(root);
	}
	
	public int heightOfTree(Node root) {
		if(root == null) {
			return 0;
		}else {
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);
			
			if(leftHeight > rightHeight) {
				return leftHeight + 1;
			}else {
				return rightHeight + 1;
			}
		}
	}
	
	//find the left skew of a tree
	public void leftNodes(Node root) {
		if(root == null) {
			return;
		}else {
			System.out.println(root.key + " ");
			if(root.left != null) {
				leftNodes(root.left);
			}
		}
	}
}
