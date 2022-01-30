package com.greatlearning.services;

import java.util.Stack;

public class BalancingBrackets {
	static Stack<Character> stack = new Stack<Character>();
	
	public static boolean bracketExpression(String input) {
		char[] inputArray = input.toCharArray();
		for(char ch: inputArray) {
			switch(ch) {
			case '(':
			case '[':
			case '{':
				stack.push(ch);
				continue;
			case ')':
				if(!stack.isEmpty()) {
					char popped = stack.pop();
					if(popped == '(') {
						continue;
					}
				}
				return false;
			case ']':
				if(!stack.isEmpty()) {
					char popped = stack.pop();
					if(popped == '[') {
						continue;
					}
				}
				return false;
			case '}':
				if(!stack.isEmpty()) {
					char popped = stack.pop();
					if(popped == '{') {
							continue;
					}
				}
				return false;
			default:
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
}
