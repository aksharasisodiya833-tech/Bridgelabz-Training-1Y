package com.gla.Hospital;

public class InPatient extends Patient implements MedicalRecord{
     int daysAdmitted;
     double dailyCharge;

    private String medicalHistory;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    public void viewRecords() {
        System.out.println("Medical Record: " + medicalHistory);
    }
}
