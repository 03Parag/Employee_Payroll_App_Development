package com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Controller;

import com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Model.EmployeeModel_Methods;
import com.example.Employee_Payroll_App_Development.UC2_Demonstrate_Various_Methods.Service.EmployeeService_Methods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController_Methods {

    @Autowired
    private EmployeeService_Methods employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeModel_Methods createEmployee(@RequestBody EmployeeModel_Methods employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<EmployeeModel_Methods> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by ID (GET)
    @GetMapping("/{id}")
    public Optional<EmployeeModel_Methods> getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public EmployeeModel_Methods updateEmployee(@PathVariable long id, @RequestBody EmployeeModel_Methods employee) {
        employee.setId(id);
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }
}
