public class RuntimePolymorphism{
    public static void main(String[] args) {
        A obj = new A();
        obj.Car();
        
        A obj1 = new B();
        obj1.Car();
    }
}