package com.greatlearning.driver;

import java.util.ArrayList;
import java.util.Collections;

import com.greatlearning.services.FindLongestPath;
import com.greatlearning.services.Node;

public class DriverTree {
	public static void main(String[] args) {
		Node root = new Node(10);
	    root.left = new Node(20);
	    root.right = new Node(30);
	    root.left.left = new Node(40);
	    root.left.right = new Node(50);
	    root.left.right.right = new Node(60);
	    root.left.right.right.left = new Node(90);
	     
	    ArrayList<Integer> output = FindLongestPath.findLongestPath(root);
	    
	    for(int i = output.size()-1; i > 0; i--) {
	    	System.out.print(output.get(i) + "->");
	    }
	    
	    System.out.print(output.get(0));
	}
}
