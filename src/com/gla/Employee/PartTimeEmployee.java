package com.gla.Employee;

public class PartTimeEmployee extends Employee implements Department{
     int hoursWorked;
     double hourlyRate;
     String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }

    @Override
    public double salarycalculation(int hours, int rate) {
        return 0;
    }
}
