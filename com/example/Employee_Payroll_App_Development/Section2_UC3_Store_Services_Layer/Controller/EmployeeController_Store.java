package com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Controller;

import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.DTO.EmployeeDTO_Store;
import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Model.EmployeeModel_Store;
import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Service.EmployeeService_Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController_Store {

    @Autowired
    private EmployeeService_Store employeeService;

    @PostMapping
    public EmployeeModel_Store addEmployee(@RequestBody EmployeeDTO_Store employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    // Get all employees
    @GetMapping
    public List<EmployeeModel_Store> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeModel_Store> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO_Store employeeDTO) {
        EmployeeModel_Store updatedEmployee = employeeService.updateEmployee(id, employeeDTO);
        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id)) {
            return ResponseEntity.ok("Employee deleted successfully.");
        }
        return ResponseEntity.notFound().build();
    }
}

