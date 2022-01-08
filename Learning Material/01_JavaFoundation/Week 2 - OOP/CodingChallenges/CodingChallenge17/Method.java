public class Method {
    int performLeftShift(){
        int i = 10;
        i = i << 1;
        return i;
    }

    void performRightShift(int val, int digitsToShift){
        int newVal = val >> digitsToShift;
        System.out.println("Input: " + val);
        System.out.println("Output: " + newVal);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println(obj.performLeftShift());
        obj.performRightShift(1000, 2);
    }
}
