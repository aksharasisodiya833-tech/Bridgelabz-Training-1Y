import java.util.Scanner;

public class TrigonometricFunctions {
    public static void calculateTrig(double degree) {

        double radian = Math.toRadians(degree);

        double sinValue = Math.sin(radian);
        double cosValue = Math.cos(radian);
        double tanValue = Math.tan(radian);

        System.out.println("Sin(" + degree + ") = " + sinValue);
        System.out.println("Cos(" + degree + ") = " + cosValue);
        System.out.println("Tan(" + degree + ") = " + tanValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        calculateTrig(angle);  
    }
}