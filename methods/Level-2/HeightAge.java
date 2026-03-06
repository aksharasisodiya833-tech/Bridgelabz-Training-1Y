import java.util.*;
public class HeightAge{
	public static int youngest(int age){
		int m=0;
		for(int i=0;i<age.length;i++){
			if(age[i]<age[m]){
				m=i;
			}
		}
			return m;
		}
			public static double tallest(double height){
				int n=0;
				for(int i=0;i<height.length;i++){
					if(height[i]>height[n]){
					  n=i;
					}
				}
					return n;
				}
				public static void main (String args[]){
					Scanner sc = new Scanner(System.in);
					String[] name = {"Amar","Akbar","Anthony"};
					int age[]=new int[3];
					double height[]=new double[3];
                 for(int i=0;i<3;i++){
                 age[i]=sc.nextInt();
                 height[i]=sc.nextDouble();

                 System.out.println("Age : "+youngest(age));
				 System.out.println("Height : "+tallest(height));
				 }
				}
}
				 
					
				
					