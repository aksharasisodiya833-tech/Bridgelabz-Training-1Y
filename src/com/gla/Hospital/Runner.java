package com.gla.Hospital;

public class Runner {
    public static void main(String[] args) {

        InPatient p1 = new InPatient(1, "Rahul", 30, 5, 2000);
        p1.addRecord("Surgery completed");

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        p1.viewRecords();

        System.out.println("----------------------");

        OutPatient p2 = new OutPatient(2, "Anjali", 25, 500);
        p2.addRecord("Fever and cold");

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
        p2.viewRecords();
    }
}
