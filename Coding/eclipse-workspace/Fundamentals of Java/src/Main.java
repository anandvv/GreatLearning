import java.util.Scanner;

public class Main {

	void printString() {
		System.out.println("Hello Great Learning");
	}
	
	int performAddition(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number:");
		int num1 = scanner.nextInt();
		
		System.out.println("Input second number:");
		int num2 = scanner.nextInt();
		
		scanner.close();
		
		int result = main.performAddition(num1, num2);
		
		System.out.println("Sum of " + num1 + " & " + num2 + " = " + result);
	}

}
