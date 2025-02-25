package com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Service;

import com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Model.EmployeeModel_UI;
import com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Repository.EmployeeRepository_UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService_UI {

    @Autowired
    private EmployeeRepository_UI employeeRepository;

    public List<EmployeeModel_UI> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel_UI addEmployee(EmployeeModel_UI employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeModel_UI getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeModel_UI updateEmployee(Long id, EmployeeModel_UI employeeDetails) {
        EmployeeModel_UI employee = getEmployeeById(id);
        if (employee != null) {
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
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
