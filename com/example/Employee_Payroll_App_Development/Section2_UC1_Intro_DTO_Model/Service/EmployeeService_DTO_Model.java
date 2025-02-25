package com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Service;

import com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Model.EmployeeModel_DTO_Model;
import com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Repository.EmployeeRepository_DTO_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService_DTO_Model {

    @Autowired
    private EmployeeRepository_DTO_Model employeeRepository;

    public List<EmployeeModel_DTO_Model> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel_DTO_Model addEmployee(EmployeeModel_DTO_Model employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeModel_DTO_Model getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeModel_DTO_Model updateEmployee(Long id, EmployeeModel_DTO_Model employeeDetails) {
        EmployeeModel_DTO_Model employee = getEmployeeById(id);
        if (employee != null) {
            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setSalary(employeeDetails.getSalary());
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

