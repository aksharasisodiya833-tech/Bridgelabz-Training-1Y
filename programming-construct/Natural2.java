import java.util.*;
class Natural2{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i;
	}
	System.out.println("the sum is "+sum);
	int formula=n*(n+1)/2;
	System.out.println("sum by formula "+formula);
	}
}