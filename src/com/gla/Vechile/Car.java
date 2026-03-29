package com.gla.Vechile;

public class Car extends Vehicle implements Insurance{
    String policyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.policyNumber = policyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Applied (Policy Hidden)");
    }
}
