package com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.DTO;

public class EmployeeDTO_DTO_Model {
    private String name;
    private double salary;

    public EmployeeDTO_DTO_Model(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

