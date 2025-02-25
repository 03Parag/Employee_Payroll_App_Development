package com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Controller;

import com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Model.EmployeeModel_DTO_Model;
import com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Service.EmployeeService_DTO_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController_DTO_Model {

    @Autowired
    private EmployeeService_DTO_Model employeeService;

    @GetMapping
    public List<EmployeeModel_DTO_Model> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Add a new employee
    @PostMapping
    public EmployeeModel_DTO_Model addEmployee(@RequestBody EmployeeModel_DTO_Model employee) {
        return employeeService.addEmployee(employee);
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeModel_DTO_Model> getEmployeeById(@PathVariable Long id) {
        EmployeeModel_DTO_Model employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        }
        return ResponseEntity.notFound().build();
    }

    // Update employee by ID
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeModel_DTO_Model> updateEmployee(@PathVariable Long id, @RequestBody EmployeeModel_DTO_Model employeeDetails) {
        EmployeeModel_DTO_Model updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        }
        return ResponseEntity.notFound().build();
    }

    // Delete employee by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully.");
    }
}

