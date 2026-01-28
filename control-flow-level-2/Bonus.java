import java.util.*;
class Bonus{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary : ");
		int salary =sc.nextInt();
		System.out.println("Enter the year : ");
		int year=sc.nextInt();
		if(year>5){
			System.out.println("you will get bonus");
			int bonus=salary*5/100;
		}
		else{
			System.out.println("after completion of 5 years");
		}
	}
}

		