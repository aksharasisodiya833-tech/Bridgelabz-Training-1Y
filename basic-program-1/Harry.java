import java.util.*;
class Harry{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int birthyear = 2000;
		System.out.println("Enter the year: ");
		int currentyear = sc.nextInt();
		int age = currentyear - birthyear;
		System.out.println(age);
	}
}
		
		