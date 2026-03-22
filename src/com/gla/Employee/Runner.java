package com.gla.Employee;

public class Runner {
    public static void main(String[] args){
        System.out.println("Employee class");
        Employee e1 = new Employee("Akshara",12345,900000);
        e1.displayDetails();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Developer class");
        Developer d2 = new Developer("Ram",324556,200000,"java");
        d2.displayDetails();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Intern class");
        intern i1 = new intern("Raj",5424564,50000000,100);
        i1.displayDetails();
    }
}


