package com.gla.Employee;

public class Runner {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee(1, "Rahul", 50000);
        PartTimeEmployee e2 = new PartTimeEmployee(2, "Anjali", 5, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        System.out.println("Full Time Employee:");
        e1.displayinfo();
        System.out.println("Salary: " +e1.salary);
        e1.getDepartmentDetails();

        System.out.println("\nPart Time Employee:");
        e2.displayinfo();
        System.out.println("Salary: " +e2.salary);
        e2.getDepartmentDetails();
    }
}