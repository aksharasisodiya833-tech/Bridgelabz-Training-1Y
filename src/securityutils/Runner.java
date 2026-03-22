package securityutils;

public class Runner {
    public static void main(String args[]) {
        String pass = "Akshara@123";
        if (Security.isStrongPassword(pass)) {
            System.out.println("Strong");

        } else {
            System.out.println("Weak");
        }
    }
}
