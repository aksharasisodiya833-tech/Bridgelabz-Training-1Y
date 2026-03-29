package com.gla.Vechile;

public class Runner {
        public static void main(String[] args) {

            Car car = new Car("UP32AB1234", 2000, "P123");
            car.displayDetails();
            double rent1 = car.calculateRentalCost(3);
            double ins1 = car.calculateInsurance();

            System.out.println("Rental Cost: " + rent1);
            System.out.println("Insurance: " + ins1);
            car.getInsuranceDetails();

            System.out.println("----------------------");


            Bike bike = new Bike("UP32XY5678", 500, "P456");
            bike.displayDetails();
            double rent2 = bike.calculateRentalCost(3);
            double ins2 = bike.calculateInsurance();

            System.out.println("Rental Cost: " + rent2);
            System.out.println("Insurance: " + ins2);
            bike.getInsuranceDetails();

            System.out.println("----------------------");


            Truck truck = new Truck("UP32TR9999", 4000, "P789");
            truck.displayDetails();
            double rent3 = truck.calculateRentalCost(3);
            double ins3 = truck.calculateInsurance();

            System.out.println("Rental Cost: " + rent3);
            System.out.println("Insurance: " + ins3);
            truck.getInsuranceDetails();
        }
    }