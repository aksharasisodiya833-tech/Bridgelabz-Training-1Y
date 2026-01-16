import java.util.*;
class TotalPrice{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of unitprice : ");
	double unitprice=sc.nextDouble();
	System.out.println("Enter the value of quantity : ");
	int quantity=sc.nextInt();
	double totalprice=unitprice*quantity;
	System.out.println("Total price : "+totalprice);
}
}