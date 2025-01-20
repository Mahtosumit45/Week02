// Main class for demonstration
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "HR", 50000.0);
        System.out.println("Employee Salary: $" + employee.getSalary());

        // Modify the salary
        employee.setSalary(55000.0);
        System.out.println("Updated Employee Salary: $" + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager(102, "IT", 80000.0, 10);

        // Display manager details
        manager.displayManagerDetails();
    }
}

class Employee {
    // Attributes with different access modifiers
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to set the salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to get the salary
    public double getSalary() {
        return salary;
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize; // Additional attribute for the manager

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public attribute
        System.out.println("Department: " + department);  // Accessing protected attribute
        System.out.println("Salary: $" + getSalary());    // Accessing private attribute via getter
        System.out.println("Team Size: " + teamSize);
    }
}

