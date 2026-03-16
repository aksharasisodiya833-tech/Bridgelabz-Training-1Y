import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter expo: ");
        double expo = sc.nextDouble();
        double result = Math.pow(base, expo);

        System.out.println("Result = " + result);
    }
}