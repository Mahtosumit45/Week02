// Main class to test the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "Alice", 8.5);
        student.displayDetails();

        // Access and modify CGPA using public methods
        System.out.println("\nUpdating CGPA...");
        student.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.0, "Computer Science");
        pgStudent.displayPostgraduateDetails();
    }
}



// Base class: Student
class Student {
    // Public member
    public int rollNumber;

    // Protected member
    protected String name;

    // Private member
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Call the parent class constructor
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("--- Postgraduate Student Details ---");
        displayDetails(); // Call parent class method
        System.out.println("Specialization: " + specialization);
    }
}

