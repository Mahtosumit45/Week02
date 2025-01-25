package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate functionality
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding FullTimeEmployee and PartTimeEmployee instances
        FullTimeEmployee fte = new FullTimeEmployee(1, "sumit", 50000, 10000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "kumar", 20000, 20, 100);

        employees.add(fte);
        employees.add(pte);

        // Displaying employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("---------------------------");
        }
    }
}
