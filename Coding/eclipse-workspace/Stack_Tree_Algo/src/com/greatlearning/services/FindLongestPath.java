package com.greatlearning.services;

import java.util.ArrayList;

public class FindLongestPath {
	public static ArrayList<Integer> findLongestPath(Node root){
		if(root == null) {
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> left = findLongestPath(root.left);
		ArrayList<Integer> right = findLongestPath(root.right);
		
		if(left.size() < right.size()) {
			right.add(root.data);
		}else {
			left.add(root.data);
		}
		
		if(left.size() < right.size()) {
			return right;
		}else {
			return left;
		}
	}
}
