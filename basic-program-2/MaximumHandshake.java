import java.util.*;
class MaximumHandshake{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=sc.nextInt();
	int maxi=(n*(n-1))/2;
	System.out.println(maxi);
}
}