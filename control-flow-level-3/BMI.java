import java.util.*;
class BMI{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight : ");
		double weight=sc.nextDouble();
		System.out.println("Enter the height in cm : ");
		double heightcm=sc.nextDouble();
		double heightm=heightcm/100;
		double bmi=weight/(heightm*heightm);
		System.out.println("BMI="+bmi);
		if(bmi<18.5){
			System.out.println("UNDER WEIGHT");
		}
		else if(bmi>=18.5 && bmi<=24.9){
			System.out.println("Normal");
		}
		else if(bmi>=25.0 && bmi<=29.9){
			System.out.println("Overweight");
		}else{
			System.out.println("obese");
		}
	}
}