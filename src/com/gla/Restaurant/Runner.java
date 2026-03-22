package com.gla.Restaurant;

public class Runner {
    public static void main(String[] args){
        System.out.println("Chef");
        Chef c1 = new Chef("Ram",5);
        c1.displayDetails();
        c1.performDuties();

        System.out.println("----------------------------------------------");
        System.out.println("Waiter");
        Waiter w1 = new Waiter("Rakesh",9);
        w1.displayDetails();
        w1.performDuties();
    }
}
