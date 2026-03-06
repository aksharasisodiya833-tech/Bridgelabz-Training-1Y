import java.util.*;
public class WindChill {
    public static double windChill(double temperature,double windSpeed){
        double windchill = 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
        return windchill;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of temperature : ");
        double temp=sc.nextDouble();
        System.out.println("Enter value of windSpeed");
        double speed=sc.nextDouble();

        System.out.println("Wind Chill temperature : "+windChill(temp,speed));

    }
}
