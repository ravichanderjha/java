Sure, let's provide a simple example of the Single Responsibility Principle (SRP) in Java.

**Problem Statement:** Imagine you are developing a class called `Employee` that represents an employee in a company. This class has both responsibilities: calculating the employee's salary and writing employee data to a file. This violates the SRP because it has more than one reason to change.

**Solution:** We should split the `Employee` class into two separate classes, each with a single responsibility: one for calculating the salary and another for writing employee data to a file.

Here's the refactored code:

```java
// EmployeeSalaryCalculator.java (Handles Salary Calculation)
public class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee) {
        // Calculate salary logic here based on employee data
        return /* calculated salary */;
    }
}

// EmployeeDataWriter.java (Handles Writing Employee Data to a File)
public class EmployeeDataWriter {
    public void writeDataToFile(Employee employee, String filename) {
        // Write employee data to the specified file
        // You can use Java's file I/O operations here
    }
}

// Employee.java (Represents Employee Data)
public class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // Getters and setters for name and salary
    
    // Other methods related to employee data (e.g., toString, equals)
}
```

In this refactored code:

- `EmployeeSalaryCalculator` is responsible for calculating the employee's salary.
- `EmployeeDataWriter` is responsible for writing employee data to a file.
- `Employee` is a simple class that holds employee data.

By separating these responsibilities into distinct classes, you follow the SRP principle. If there are changes in salary calculation logic or data writing logic, you can modify the respective class without affecting the other, making your code more maintainable and easier to understand.