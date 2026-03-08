package com.employeepayroll;

import java.sql.*;

public class EmployeePayrollDBService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASS = "@Aniket123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ✅");

            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Established ✅ : " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
