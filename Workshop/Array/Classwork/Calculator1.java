import java.util.*;
class Calculator1{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
	return a-b;
}
    public int div(int a,int b){
		return a/b;
	}
	public int mul(int a,int b){
		return a*b;
	}  
		public static void main(String args[]){
		System.out.println("---------------------------------WELCOME TO MY PROJECT-------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divide");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator c1=new Calculator();
		while(true)
		{
		int choice=sc.nextInt();
		switch (choice)
		{
		case 1:
		int addition =c1.add(a,b);
		System.out.println("Addition of two number :-"+addition);
		   break;
		   
		case 2:   
		int subtraction=c1.sub(a,b);
		System.out.println("Substraction of two number :-"+subtraction);
		        break;
				
		case 3:
		int divide=c1.div(b,a);
		System.out.println("Divide of two number :-"+divide);
		       break;
			   
	    case 4:
		int multiplication=c1.mul(a,b);
		System.out.println("Multiplication of two number :-"+multiplication);
		      break;
			  
			  default:
			  System.out.println("Invalid");
		    }
		}
	}
}