package com.gla.BankAccount;

public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void interestRate() {
        System.out.println("Interest Rate: " +interestRate);
    }
}