package com.gla.Restaurant;

public class Chef extends Person implements worker{

    public Chef(String name,int id){
        super(name,id);
    }

    @Override
    public void performDuties() {
        System.out.println("food is made by : "+name);
    }
}
