package com.gla.Vechile;

public abstract class Vehicle {
    String vehicleNumber;
    String type;
    double rentalRate;

    public Vehicle(String type, String vehicleNumber, double rentalRate) {
    }

    public void Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getvehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("VechileNumber : "+vehicleNumber);
        System.out.println("Type : "+type);
        System.out.println("RentalRate : "+rentalRate);
    }
}
