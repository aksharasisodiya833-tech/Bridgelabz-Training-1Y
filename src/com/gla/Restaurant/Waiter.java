package com.gla.Restaurant;

public class Waiter extends Person implements worker{

    public Waiter(String name,int id){
        super(name,id);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving Customer :"+name);
    }
}
