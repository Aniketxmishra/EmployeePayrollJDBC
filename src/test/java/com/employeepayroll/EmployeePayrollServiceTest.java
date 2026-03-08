package com.employeepayroll;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeePayrollServiceTest {

    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        List<EmployeePayrollData> employeePayrollList = dbService.getEmployeePayrollData();
        assertEquals(3, employeePayrollList.size());
    }
}
