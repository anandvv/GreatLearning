public class OperatorTernary {
    public static void main(String[] args) {
        int givenNumber = 11;

        String msg =  (givenNumber%2 == 0)
        ? "even"
        : "odd";

        System.out.println(msg);
    }
}
