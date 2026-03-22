package com.gla.Animal;

public class Dog extends Animal{
    String makeSound;

    public Dog(String name,int age,String makeSound){
        super(name,age);
        this.makeSound=makeSound;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Make sound : "+makeSound);
    }
}
