import java.util.*;
class Armstrong1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num=sc.nextInt();
		int i=num;
		int result=0;
		while(num!=0){
			int digit=num%10;
			result+=digit*digit*digit;
			num/=10;
		}
		if(result==num){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
		}
	}
}