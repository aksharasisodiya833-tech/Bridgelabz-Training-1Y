package com.gla.Animal;

public class Runner {
    public static void main(String[] args){
        System.out.println("Animal class");
        Animal a1 = new Animal("lion",7);
        a1.displayDetails();


        System.out.println("----------------------------------------------------------");
        System.out.println("Dog class");
        Dog d1 = new Dog("oreo",9,"Bark Bark");
        d1.displayDetails();


        System.out.println("-----------------------------------------------------------");
        System.out.println("Cat class");
        Cat c1 = new Cat("michain",11,"Meow Meow");
        c1.displayDetails();


        System.out.println("-------------------------------------------------------------");
        System.out.println("Birds class");
        Birds b1 = new Birds("cherry",12,"Chrip Chrip");
        b1.displayDetails();
    }
}
