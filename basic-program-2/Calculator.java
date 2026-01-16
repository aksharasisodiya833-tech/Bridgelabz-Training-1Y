import java.util.*;
class Calculator{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a : ");
	int a=sc.nextInt();
	System.out.println("Enter the value of b : ");
	int b=sc.nextInt();
	int add=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	int mod=a%b;
	System.out.println("Addtion : "+add);
	System.out.println("Subtraction : "+sub);
	System.out.println("Multiply : "+mul);
	System.out.println("Divide : "+div);
	System.out.println("Modulus : "+mod);
	}
}
	