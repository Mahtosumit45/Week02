// Employee.java
class Employee {
    // Instance variables (attributes)
    String name;
    int id;
    double salary;

    // Constructor to initialize the employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee("John Doe", 101, 55000.0);
        
        // Display employee details
        employee.displayDetails();
    }
}
