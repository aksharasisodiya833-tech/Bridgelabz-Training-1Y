import java.util.*;
public class SmallestLargest {
    public static int largest(int num1, int num2, int num3) {
        int largest = num1;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is largest");
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
            System.out.println("num2 is largest");
        } else {
            System.out.println("num3 is largest");
            largest = num3;
        }
        return largest;
    }
        public static int smallest(int num1,int num2,int num3) {
            int smallest = num1;
            if (num1 <= num2 && num1 <= num3) {
                System.out.println("num1 is smallest");
            } else if (num2 <= num1 && num2 <= num3) {
                smallest = num2;
                System.out.println("num2 is smallest");
            } else {
                System.out.println("num3 is smallest");
                smallest = num3;
            }
            return smallest;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num1 : ");
            int num1=sc.nextInt();
            System.out.print("Enter num2 : ");
            int num2=sc.nextInt();
            System.out.print("Enter num3 : ");
            int num3=sc.nextInt();

            System.out.println("Largest number : "+largest(num1,num2,num3));
            System.out.println("Smallest number : "+smallest(num1,num2,num3));
        }
    }
