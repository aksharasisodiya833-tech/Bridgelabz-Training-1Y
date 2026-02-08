import java.util.*;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int even[] = new int[n];
		int odd[] = new int[n];
		int evencount=0,oddcount=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				even[evencount]=i;
				evencount++;
			}
			else{
				odd[oddcount]=i;
				oddcount++;
			}
		}
		System.out.println("Even number");
		for(int i=0;i<evencount;i++){
			System.out.println(even[i]+" ");
	}
	System.out.println("odd number");
		for(int i=0;i<oddcount;i++){
			System.out.println(odd[i]+" ");
		}
	}
}
			
		