package com.gla.Employee;

public class intern extends Employee {
    int duration;

    public intern(String name,int id,int salary,int duration){
        super(name, id, salary);
        this.duration=duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration :-"+duration);
    }
}
