import java.util.*;
class Sum{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		double num=sc.nextDouble();
		double total=0.0;
		while(num!=0){
			total=total+num;
			System.out.println("Enter a number (0 to stop): ");
			num = sc.nextDouble();
		}
		System.out.println("TOTAL SUM IS :-"+total);
	}
}