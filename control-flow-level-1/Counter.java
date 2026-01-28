import java.util.*;
class Counter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int count=sc.nextInt();
		while(count>=1){
			count--;
			System.out.println(count);
		}
	}
}