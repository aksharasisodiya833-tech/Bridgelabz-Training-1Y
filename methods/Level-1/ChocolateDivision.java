import java.util.Scanner;
public class ChocolateDivision {
    public static void divideChocolates(int chocolates, int children) {

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets: " + eachChild);
        System.out.println("Remaining chocolates: " + remaining);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int n = sc.nextInt();

        System.out.print("Enter total number of children: ");
        int m = sc.nextInt();

        divideChocolates(n,m);
    }
}
