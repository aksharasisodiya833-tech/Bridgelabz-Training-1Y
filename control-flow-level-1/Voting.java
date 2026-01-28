import java.util.*;
class Voting
{
public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value : ");
	   int a=sc.nextInt();
	   if(a>=18){
		   System.out.println("Eligible");
	   }
	   else{
		   System.out.println("Not Eligible");
	   }
}
}