import java.util.*;
class EvenOdd{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++){
				if(i%2==0){
					System.out.println("Even");
				}
				else{
					System.out.println("Odd");
				}
			}
		}
		else{
			System.out.println("Enter the positive number");
		}
	}
}