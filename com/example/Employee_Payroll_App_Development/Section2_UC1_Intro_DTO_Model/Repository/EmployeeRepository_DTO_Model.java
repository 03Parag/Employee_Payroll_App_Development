package com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Repository;

import com.example.Employee_Payroll_App_Development.Section2_UC1_Intro_DTO_Model.Model.EmployeeModel_DTO_Model;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository_DTO_Model extends JpaRepository<EmployeeModel_DTO_Model, Long> {
}

