import java.util.*;
class UserSum{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		double total=0.0;
		while(true){
		System.out.println("enter the number[at zero or negative is str]");
		double num= sc.nextDouble();
		if(num<0){
			break;
		}
		total=total+num;
		}
		System.out.println("total sum="+total);
	}
}