package com.employeepayroll;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EmployeePayrollServiceTest {

    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        List<EmployeePayrollData> employeePayrollList = dbService.getEmployeePayrollData();
        assertEquals(4, employeePayrollList.size());
    }
    @Test
    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatch() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        int result = dbService.updateEmployeeSalary("Terisa", 3000000.00);
        assertEquals(1, result);
    }
    @Test
    public void givenNewSalaryForEmployee_WhenUpdatedUsingStoredProcedure_ShouldMatch() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        int result = dbService.updateEmployeeSalaryWithStoredProcedure("Terisa", 5000000.00);
        assertEquals(1, result);
    }
    @Test
    public void givenEmployeeName_WhenRetrieved_ShouldReturnCorrectData() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        List<EmployeePayrollData> employeePayrollList = dbService.getEmployeePayrollData("Terisa");
        assertEquals(1, employeePayrollList.size());
    }
    @Test
    public void givenNewEmployee_WhenAdded_ShouldSyncWithDB() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        EmployeePayrollData employee = dbService.addEmployeeToPayroll("Mark", 5000000.00, LocalDate.now(), "M");
        assertNotNull(employee);
        assertEquals("Mark", employee.name);

        // Cleanup - delete Mark after test so count stays at 4
        dbService.deleteEmployeeFromPayroll(employee.id);
    }





}
