public class LeapYear {
    public static void main(String[] args) {
        int year = 1200;

        //if leap year is perfectly divisible by 400 print leap year
        if(year%400 == 0){
            System.out.println("Leap Year");
        }
        //print not a leap year if divisible by 100 and not divisible by 400
        else if(year%100 == 0){
            System.out.println("Not a Leap Year");
        }
        //print leap year if divisible by 4 and not divisible by 100
        else if(year%4 == 0){
            System.out.println("Leap Year");
        }
        // rest all years are non leap years
        else{
            System.out.println("Not a Leap Year");
        }
        
    }
}
