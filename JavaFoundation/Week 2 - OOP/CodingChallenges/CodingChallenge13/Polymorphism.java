public class Polymorphism {
    double findArea(int l, int w){
        return (double)l * w;
    }

    double findArea(int l, int w, int h){
        return (double)l * w * h;
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        System.out.println(obj.findArea(10, 12));
        System.out.println(obj.findArea(10, 12, 10));
    }
}
