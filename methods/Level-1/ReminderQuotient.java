import java.util.*;
public class ReminderQuotient {
    public static void reminderQuotient(int a,int b){
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int div=a/b;
        int mod=a%b;
        System.out.println(div);
        System.out.println(mod);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();

        reminderQuotient(a,b);
    }
}
