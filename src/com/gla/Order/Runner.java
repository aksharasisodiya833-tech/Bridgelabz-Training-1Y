package com.gla.Order;

public class Runner {
    public static void main(String[] args){
        System.out.println("Order class");
        Order o1 = new Order(101,"20-4-2023","Order Placed");
        o1.displayDetails();


        System.out.println("---------------------------------------------------");
        System.out.println("Shipped Order class");
        ShippedOrder s1 = new ShippedOrder(102,"27-4-2023","Shipped","TRE324");
        s1.displayDetails();


        System.out.println("-----------------------------------------------------");
        System.out.println("Delivery order class");
        DeliveryOrder d1 = new DeliveryOrder(103,"30-4-2023","Order Delivered","31-4-2023");
        d1.displayDetails();
    }
}
