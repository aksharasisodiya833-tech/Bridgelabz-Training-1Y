package com.gla.Employee;

public class FullTimeEmployee extends Employee implements Department{
     String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(name, id, salary);
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