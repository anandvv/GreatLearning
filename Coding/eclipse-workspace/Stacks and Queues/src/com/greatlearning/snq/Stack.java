package com.greatlearning.snq;
import java.util.*;

public class Stack {
	int stackTop = -1;
	int[] array;
	
	public Stack(int stackSize) {
		this.array = new int[stackSize];
	}
	
	public void push(int number) {
		if(stackTop == this.array.length -1) {
			System.out.println("Stack is full!");
		}else {
			this.array[++stackTop] = number;
		}
	}
	
	public int pop() {
		if(stackTop == -1) {
			System.out.println("Stack is empty!");
			return 0;
		}else {
			return this.array[stackTop--];
		}
	}
	
	public int getMin() {
		if(stackTop == -1) {
			System.out.println("Stack is empty!");
			return 0;
		}else {
			int min = Integer.MAX_VALUE;
			for(int i = stackTop; i > -1; i--) {
				if(array[i] < min) {
					min = array[i];
				}
			}
			return min;
		}
	}
	
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int size = in.nextInt();
        
        int queries = in.nextInt();

        int i=0;

        Stack stack = new Stack(size);

        while(i++ < queries){

        	System.out.println("Enter option (push/pop/min):");
        	
            switch(in.next()){

            case "push": stack.push(in.nextInt()); break;

            case "pop": stack.pop(); break;

            case "min": System.out.println(stack.getMin());

            }
        }
        
        in.close();
    }
}
