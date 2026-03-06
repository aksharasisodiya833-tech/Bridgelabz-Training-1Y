import java.util.*;
 public class NaturalNumber{
	 public static int recursiveSum(int n){
		 if(n==1){
			 return 1;
		 }
	 }
	 public static void main(String arg[]){
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 if(n<=0){
			 System.out.println("Enter the positive number : ");
			 return;
		 }
		 int recursion=recursiveSum(n);
		 int formula=n*(n+1)/2;
		 
		 System.out.println("Sum of Recursion : " +recursion);
		 System.out.println("Sum of Formula : " +formula);

	 if(recursion==formula){
		 System.out.println("Result are correct and equal");
	 }
	 else{
		 System.out.println("Result are not equal");
	 }
 }
		 