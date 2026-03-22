package com.gla.Animal;

public class Birds extends Animal {
    String makeSound;

    public Birds(String name,int age,String makeSound){
        super(name, age);
        this.makeSound=makeSound;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Make sound : "+makeSound);
    }
}
