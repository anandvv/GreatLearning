public class CodingChallenge10 {
    public static void main(String args[]){
        InheritanceC obj = new InheritanceC();
        double circleArea = obj.circleArea(5);
        System.out.println(circleArea);

        double rectangleArea = obj.rectangleArea(10.0, 5.0);
        System.out.println(rectangleArea);

        double triangleArea = obj.triangleArea(10.0, 12.0);
        System.out.println(triangleArea);
    }    
}

