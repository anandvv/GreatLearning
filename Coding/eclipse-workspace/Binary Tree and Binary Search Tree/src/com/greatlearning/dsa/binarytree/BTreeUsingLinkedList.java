package com.greatlearning.dsa.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BTreeUsingLinkedList {
	Deque<Node> queue = new LinkedList<Node>();
	int minimum = Integer.MAX_VALUE;
	int maximum = Integer.MIN_VALUE;
	
	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
	}
	
	public void levelByLevel(Node root) {
		Queue<Node> queue1 = new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node tempNode = queue1.poll();
			System.out.println(tempNode.key + " ");
			
			//Keep track on minimum and maximum values
			if(tempNode.key < this.minimum) {
				this.minimum = tempNode.key;
			}
			
			if(tempNode.key > this.maximum) {
				this.maximum = tempNode.key;
			}
			
			//enqueue left Node
			if(tempNode.left != null) {
				queue1.add(tempNode.left);
			}
			
			//enqueue right Node
			if(tempNode.right != null) {
				queue1.add(tempNode.right);
			}
			
		}
	}
	
	public Node insertNode(Node root, int key) {
		Node newNode = newNode(key);
		
		if(root == null) {
			root = newNode;
			queue.add(root);
			return root;
		}else {
			Node node;
			node = queue.remove();
			
			System.out.println("Parent is: " + node.key);
			
			if(node.left == null) {
				node.left = newNode;
				queue.add(node.left);
				queue.addFirst(node);
				return root;
			}else if (node.right == null) {
				node.right = newNode;
				queue.add(node.right);
				return root;
			}
		}
		return root;
	}
	
	public void levelOrderTraversal(Node root) {
		Deque<Node> tQueue = new LinkedList<Node>();
		Node temp_node = root;
		
		while(temp_node != null) {
			System.out.print(temp_node.key + " ");
			if(temp_node.left != null) {
				tQueue.add(temp_node.left);
			}
			if(temp_node.right != null) {
				tQueue.add(temp_node.right);
			}
			
			try {
				temp_node = tQueue.remove();
			}catch(NoSuchElementException ex) {
				temp_node = null;
			}
		}

		System.out.println("Level Order Traversal Complete!");
	}
	
	public void inOrderTraversal(Node root) {
		if(root.left != null) {
			inOrderTraversal(root.left);
		}
		
		System.out.print(root.key + " ");
		
		if(root.right!=null) {
			inOrderTraversal(root.right);
		}
	}
	
	public void preOrderTraversal(Node root) {
		System.out.print(root.key + " ");
		
		if(root.left != null) {
			preOrderTraversal(root.left);
		}
		
		if(root.right!=null) {
			preOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(Node root) {
		
		if(root.left != null) {
			postOrderTraversal(root.left);
		}
		
		if(root.right!=null) {
			postOrderTraversal(root.right);
		}
		
		System.out.print(root.key + " ");
	}
	

}
