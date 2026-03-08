# Employee Payroll JDBC

A Java JDBC project to manage employee payroll data using MySQL database.

## Tech Stack
- Java
- JDBC (MySQL Connector)
- MySQL
- JUnit 5
- Maven

## Use Cases

| UC | Branch | Description |
|---|---|---|
| UC1 | `feature/UC1-DBConnection` | Establish JDBC connection to payroll_service DB |
| UC2 | `feature/UC2-RetrieveEmployees` | Retrieve all employee payroll data from DB |
| UC3 | `feature/UC3-UpdateSalary` | Update employee salary using PreparedStatement |
| UC4 | `feature/UC4-StoredProcedure` | Update employee salary using MySQL Stored Procedure |
| UC5 | `feature/UC5-RetrieveByName` | Retrieve employee payroll data by name |
| UC6 | `feature/UC6-AddEmployee` | Add new employee to payroll DB |

## Database Setup
```sql
CREATE DATABASE payroll_service;
USE payroll_service;

CREATE TABLE employee_payroll (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    gender CHAR(1),
    salary DOUBLE NOT NULL,
    start DATE NOT NULL
);
