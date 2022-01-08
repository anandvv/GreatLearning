package com.greatlearning.snq;

import java.util.Scanner;

public class Queue {
	
	int[] array;
	int front, rear;

	public Queue(int size) {
		this.array = new int[size];
		front = rear = -1;
	}
	
	private void display() {
		if(!isEmpty()) {
			for(int i=this.front; i<=this.rear; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is empty!");
		}
	}

	private int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue underflow!");
			return -1;
		}else {
			int retVal = array[front];
			//System.out.println(retVal + " has been dequeued!");
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
			}
			return retVal;
		}
		
	}

	private boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		
		return false;
	}

	private void enqueue(int i) {
		if(!isFull()) {
			array[++rear] = i;
			if(front == -1) {
				front++;
			}
		}else {
			System.out.println("Queue overflow!");
		}		
	}

	private boolean isFull() {
		if(rear == array.length-1) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue: \n");
		int size = sc.nextInt();
		sc.close();
		
		int n = 10;
		Queue myQueue = new Queue(size);
	    myQueue.enqueue(0);
	    myQueue.enqueue(1);
	    for (int k = 0; k < n; k++)
	       {
	           int no1 = myQueue.dequeue();
	           int no2 = myQueue.dequeue();
	           myQueue.enqueue(no2);
	           myQueue.enqueue(no1 + no2);
	           System.out.println(no1);
	     }
	}
	
}
