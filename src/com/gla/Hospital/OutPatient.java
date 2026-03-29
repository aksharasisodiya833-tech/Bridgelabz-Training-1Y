package com.gla.Hospital;

public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;

    private String diagnosis;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        this.diagnosis = record;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}