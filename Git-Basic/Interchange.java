public class Interchange {
    public static void main(String[] args) {
        int num1, num2;

        num1 = 3;
        num2 = 4;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);

    }
}
