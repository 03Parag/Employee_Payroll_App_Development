package com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Repository;

import com.example.Employee_Payroll_App_Development.Section2_UC3_Store_Services_Layer.Model.EmployeeModel_Store;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository_Store extends JpaRepository<EmployeeModel_Store, Long> {
}

