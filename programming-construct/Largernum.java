import java.util.*;
class Largernum
{
public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of num1 : ");
	   int num1=sc.nextInt();
	   System.out.println("Enter the value of num2 : ");
	   int num2=sc.nextInt();
	   System.out.println("Enter the value of num3 : ");
	   int num3=sc.nextInt();
	   if(num1>num2 && num2>num3){
	      System.out.println("True");
	   }
	   else{
		   System.out.println("False");
	   }
}
}
				   