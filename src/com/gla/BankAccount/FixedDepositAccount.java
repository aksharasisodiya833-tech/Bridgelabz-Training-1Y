package com.gla.BankAccount;

public class FixedDepositAccount extends BankAccount{
    int duration;

    public FixedDepositAccount(int accountNumber,double balance,int duration){
        super(accountNumber, balance);
        this.duration=duration;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void duration() {
        System.out.println("Duration: " +duration);
    }
}