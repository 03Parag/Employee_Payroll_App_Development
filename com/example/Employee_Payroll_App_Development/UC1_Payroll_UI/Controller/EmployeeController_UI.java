package com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Controller;

import com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Model.EmployeeModel_UI;
import com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Service.EmployeeService_UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController_UI {

    @Autowired
    private EmployeeService_UI employeeService;

    // Get all employees
    @GetMapping
    public List<EmployeeModel_UI> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Add a new employee
    @PostMapping
    public EmployeeModel_UI addEmployee(@RequestBody EmployeeModel_UI employee) {
        return employeeService.addEmployee(employee);
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeModel_UI> getEmployeeById(@PathVariable Long id) {
        EmployeeModel_UI employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        }
        return ResponseEntity.notFound().build();
    }

    // Update employee by ID
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeModel_UI> updateEmployee(@PathVariable Long id, @RequestBody EmployeeModel_UI employeeDetails) {
        EmployeeModel_UI updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
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
