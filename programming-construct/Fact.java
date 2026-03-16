import java.util.*;
class Fact{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.println("the factorial of number is "+fact);
	}
}