import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = in.nextInt();
        in.close();

        if(num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
}
