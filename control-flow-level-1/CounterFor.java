import java.util.*;
class CounterFor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int count=sc.nextInt();
		for(count=0;count>=1;count--){
			System.out.println(count);
		}
	}
}