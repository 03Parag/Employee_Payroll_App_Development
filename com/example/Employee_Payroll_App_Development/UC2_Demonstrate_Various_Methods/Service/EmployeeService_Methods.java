package com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Service;

import com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Model.EmployeeModel_Methods;
import  com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Repository.EmployeeRepository_Methods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService_Methods {

    @Autowired
    private EmployeeRepository_Methods employeeRepository;

    public EmployeeModel_Methods saveEmployee(EmployeeModel_Methods employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeModel_Methods> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeeModel_Methods> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}

