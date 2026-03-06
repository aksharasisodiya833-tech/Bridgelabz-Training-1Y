import java.util.*;
public class Positive {
    public static void positiveNegative(int a) {
        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
        public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        positiveNegative(a);

        }
    }
