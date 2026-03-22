package com.gla.Animal;

public class Animal {
    String name;
    int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
