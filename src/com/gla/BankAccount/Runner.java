package com.gla.BankAccount;

public class Runner {
    public static void main(String[] args){
        System.out.println("Bank Account");
        BankAccount b1 = new BankAccount(101,500000);
        b1.displayDetails();
        b1.displayAccountType();


        System.out.println("-------------------------------------------------");
        System.out.println("Saving Account");
        SavingAccount s1 = new SavingAccount(102,6000000,3.5);
        s1.displayDetails();
        s1.displayAccountType();
        s1.interestRate();


        System.out.println("---------------------------------------------------");
        System.out.println("Withdrawal Limit Account");
        WithdrawalLimit w1 = new WithdrawalLimit(203,4555999,10000);
        w1.displayDetails();
        w1.displayAccountType();
        w1.withdrawalLimit();

        System.out.println("------------------------------------------------------");
        System.out.println("Fixed Deposit Account");
        FixedDepositAccount f1 = new FixedDepositAccount(609,5000000,12);
        f1.displayDetails();
        f1.displayAccountType();
        f1.duration();
        }
    }

