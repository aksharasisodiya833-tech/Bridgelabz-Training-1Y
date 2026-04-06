package bankAccountSimulation;

public class BankAccount implements Runnable {
    String name;
    String accountType;

    public BankAccount(String name, String accountType) {
        this.accountType = accountType;
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Accountholder name "+name+"Accounttype "+accountType);
            System.out.println("------------------------------------------------------------");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
