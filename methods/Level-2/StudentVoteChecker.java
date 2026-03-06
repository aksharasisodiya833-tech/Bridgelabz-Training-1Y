import java.util.*;
public class StudentVoteChecker {
    public boolean studentVote(int age){
       if(age<0){
           return false;
       }
       if(age>=18){
           return true;
       }
       return false;
    }
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         StudentVoteChecker s1 = new StudentVoteChecker();
         int age[] = new int[10];
         for (int i = 0; i < 10; i++) {
             age[i] = sc.nextInt();
             boolean result = s1.studentVote(age[i]);
             if (result) {
                 System.out.println("Can Eligible for Vote");
             } else {
                 System.out.println("Cannot Eligible for Vote");
             }
         }
     }
}