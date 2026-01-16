import java.util.*;
class Avg{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int maths=sc.nextInt();
		int physics=sc.nextInt();
		int chem=sc.nextInt();
		int avg=(maths+physics+chem)/3;
		System.out.println(avg);
		}
	}	