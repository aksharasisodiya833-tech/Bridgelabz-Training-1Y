package com.gla.Restaurant;

public class Person {
    String name;
    int id;

    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}
interface worker{
    public void performDuties();
}