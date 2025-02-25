package com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Service;

import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.DTO.EmployeeDTO_Store;
import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Model.EmployeeModel_Store;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService_Store {

    private final List<EmployeeModel_Store> employeeList = new ArrayList<>();

    public EmployeeModel_Store addEmployee(EmployeeDTO_Store employeeDTO) {
        EmployeeModel_Store employee = new EmployeeModel_Store();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.add(employee);
        return employee;
    }

    public List<EmployeeModel_Store> getAllEmployees() {
        return employeeList;
    }

    public EmployeeModel_Store updateEmployee(Long id, EmployeeDTO_Store employeeDTO) {
        for (EmployeeModel_Store employee : employeeList) {
            if (employee.getId().equals(id)) {
                employee.setName(employeeDTO.getName());
                employee.setSalary(employeeDTO.getSalary());
                return employee;
            }
        }
        return null;
    }

    public boolean deleteEmployee(Long id) {
        return employeeList.removeIf(employee -> employee.getId().equals(id));
    }
}

