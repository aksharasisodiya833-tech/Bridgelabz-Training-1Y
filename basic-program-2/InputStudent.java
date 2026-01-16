import java.util.*;
class InputStudent{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of pen : ");
int pen=sc.nextInt();
System.out.println("Enter the value of student : ");
int student=sc.nextInt();
int que=pen/student;
int rem=pen%student;
System.out.println(que);
System.out.println(rem);
}
}


