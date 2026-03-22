package com.gla.BankAccount;

public class WithdrawalLimit extends BankAccount{
    double withdrawalLimit;

    public WithdrawalLimit(int accountNumber,double balance,double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }


    public void withdrawalLimit() {
        System.out.println("Withdrawal Limit: " +withdrawalLimit);
    }
}
