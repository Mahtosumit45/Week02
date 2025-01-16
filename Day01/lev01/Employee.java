// Employee class
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize the attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to test the Employee class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("John Doe", 101, 50000);

        // Displaying the employee details
        emp1.displayDetails();
    }
}
