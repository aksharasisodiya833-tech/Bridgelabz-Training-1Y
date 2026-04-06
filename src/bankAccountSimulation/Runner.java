package bankAccountSimulation;

public class Runner {
    public static void main(String args[]){
        BankAccount a = new BankAccount("Ram","Premium");
        BankAccount b = new BankAccount("Angle","Regular");
        BankAccount c = new BankAccount("Raj","Basic");


        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);


        t1.start();
        t2.start();
        t3.start();
    }
}
