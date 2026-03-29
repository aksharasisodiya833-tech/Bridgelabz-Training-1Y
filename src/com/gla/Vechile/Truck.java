package com.gla.Vechile;

public class Truck extends Vehicle implements Insurance{
    String policyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Applied (Policy Hidden)");
    }
}
