import java.util.*;
public class LeapYear {
    public static void leapYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Year : ");
            int a=sc.nextInt();
            leapYear(a);
        }
    }
