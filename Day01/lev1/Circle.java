  // Main method to test the Circle class
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Create a Circle object with the provided radius
        Circle circle = new Circle(radius);
        
        // Display the circle's area and circumference
        circle.display();
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

public class 
 {
    // Declare the radius as an instance variable
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle (π * radius^2)
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle (2 * π * radius)
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the radius, area, and circumference
    public void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.printf("Area: %.2f\n", area());
        System.out.printf("Circumference: %.2f\n", circumference());
    }

  