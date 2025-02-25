package com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.Service;

import com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.DTO.EmployeeDTO_Services;
import com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.Model.EmployeeModel_Services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService_Services {

    private final List<EmployeeModel_Services> employeeList = new ArrayList<>();

    public EmployeeModel_Services addEmployee(EmployeeDTO_Services employeeDTO) {
        EmployeeModel_Services employee = new EmployeeModel_Services();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.add(employee);
        return employee;
    }

    public List<EmployeeModel_Services> getAllEmployees() {
        return employeeList;
    }
}

