import java.util.*;
class IntOperation{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a : ");
	int a=sc.nextInt();
	System.out.println("Enter the value of b : ");
	int b=sc.nextInt();
	System.out.println("Enter the value of c : ");
	int c=sc.nextInt();
	int num1=a+b*c;
	int num2=a*b+c;
	int num3=c+a/b;
	int num4=a%b+c;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
}
}
	