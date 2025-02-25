package com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Model;

import jakarta.persistence.*;

@Entity
public class EmployeeModel_Methods {
    @Id
    private long id;
    private String name;
    private double salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
