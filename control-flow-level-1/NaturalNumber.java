import java.util.*;
class NaturalNumber
{
public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value : ");
	   int a=sc.nextInt();
	   int natural=a*(a+1)/2;
	   System.out.println(natural);
}
}