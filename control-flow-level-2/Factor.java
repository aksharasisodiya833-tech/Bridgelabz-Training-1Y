import java.util.*;
class Factor{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		if(num<=0){
			System.out.println("plz enter a positive integer");
		}else{
			System.out.println("Factors of" +num+ " are:");
			for(int i=1;i<=num;i++){
				if(num%i==0){
					System.out.println(i);
				}
			}
		}
	}
}