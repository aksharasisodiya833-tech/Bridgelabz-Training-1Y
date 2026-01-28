import java.util.*;
class FizzbuzzFor{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		if(num<=0){
			System.out.println("Plz enter the positive number ");
		}
		else{
		for(int i=0;i<=num;i++){
			if(i%3==0 && i%5==0){
				System.out.println("fizzbuzz");
			}
			else if(i%3==0){
				System.out.println("fizz");
			}
			else if(i%5==0){
				System.out.println("buzz");
			}
			else{
				System.out.println(i);
			}
		}
     }
	}
}
		