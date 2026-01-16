import java.util.*;
class HeightintoFeet{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value : ");
	float height=sc.nextFloat();
	double feet=height/30.48;
	double inches=height/2.54;
	System.out.println(feet);
	System.out.println(inches);
}
}