package com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Repository;

import com.example.Employee_Payroll_App_Development.UC1_Payroll_UI.Model.EmployeeModel_UI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository_UI extends JpaRepository<EmployeeModel_UI, Long> {
}
