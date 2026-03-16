import java.util.*;
class Palindrome{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		int temp = num;
		int rem ;
		int rev = 0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}