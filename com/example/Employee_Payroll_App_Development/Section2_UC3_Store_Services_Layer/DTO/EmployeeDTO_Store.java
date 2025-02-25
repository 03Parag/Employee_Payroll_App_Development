package com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.DTO;

public class EmployeeDTO_Store {
    private String name;
    private double salary;

    public EmployeeDTO_Store(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

