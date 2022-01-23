import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingTwoQueues {

	Queue<Integer> queue;
	Queue<Integer> tempQueue;
	
	public StackUsingTwoQueues() {
		this.queue = new LinkedList<Integer>();
		this.tempQueue = new LinkedList<Integer>();
	}
	
	public static void main(String[] args) {
		
		StackUsingTwoQueues myStack = new StackUsingTwoQueues();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Stack using Two Queues \n");
		
		char ch;
		
		do {
			System.out.println("Stack Operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Check Empty");
			System.out.println("4. Size");
			System.out.println("5. Display Stack");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter the element to push: ");
				int number = sc.nextInt();
				myStack.push(number);
				break;
			case 2:
				try {
					int popped = myStack.pop();
					System.out.println("Element " + popped + " popped!");
				}catch(NoSuchElementException ex) {
					System.err.println(ex.getMessage());
				}
				break;
			case 3:
				boolean isEmpty = myStack.isEmpty();
				if(isEmpty) {
					System.out.println("Stack is empty!");
				}else {
					System.out.println("Stack is NOT empty!");
				}
				break;
			case 4:
				int size = myStack.getSize();
				System.out.println("Stack size: " + size);
				break;
			case 5:
				myStack.display();
				break;
			default:
				System.out.println("Invalid entry!");
				break;
			}
			
			System.out.println("Continue? (Y/N): ");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch== 'y');
		
		sc.close();
	}

	private int getSize() {
		return queue.size();
	}

	private boolean isEmpty() {
		if(queue.size() == 0) {
			return true;
		}
		
		return false;
	}

	private int pop() {
		// TODO Auto-generated method stub
		if(queue.size() == 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		
		return queue.remove();
	}

	private void push(int number) {
		if(queue.size() == 0) {
			queue.add(number);
		}else {
			while(queue.size()!=0) {
				tempQueue.add(queue.remove());
			}
			//add to main queue
			queue.add(number);
			
			while(tempQueue.size()!=0) {
				queue.add(tempQueue.remove());
			}
		}
	}

	private void display() {
		if(queue.size() != 0) {
			Iterator<Integer> iter = queue.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
		}
		else {
			System.out.println("Queue is empty!");
		}
	}
}
