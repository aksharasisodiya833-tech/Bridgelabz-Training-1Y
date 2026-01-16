import java.util.*;
class Profit{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the cost value: ");
int cost=sc.nextInt();
System.out.println("Enter the sell value: ");
int sell=sc.nextInt();
int pro=sell-cost;
int pp=(pro/cost)*100;
System.out.println(pro);
System.out.println(pp);
}
}