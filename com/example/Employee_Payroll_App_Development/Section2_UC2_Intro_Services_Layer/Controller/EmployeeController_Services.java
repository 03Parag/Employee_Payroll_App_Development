package com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.Controller;

import com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.DTO.EmployeeDTO_Services;
import com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.Model.EmployeeModel_Services;
import com.example.Employee_Payroll_App_Development.Section2_UC2_Intro_Services_Layer.Service.EmployeeService_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController_Services {

    @Autowired
    private EmployeeService_Services employeeService;

    @PostMapping
    public EmployeeModel_Services addEmployee(@RequestBody EmployeeDTO_Services employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeModel_Services> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}

