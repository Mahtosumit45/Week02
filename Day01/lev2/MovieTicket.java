import java.util.Scanner;

public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the MovieTicket object with default values
    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Method to book a ticket: assigns seat and updates price
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (movieName.isEmpty() || seatNumber.isEmpty()) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + String.format("%.2f", price));
        }
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();
        
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Input movie name
        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();
        
        // Input seat number
        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();
        
        // Input ticket price
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();
        
        // Book the ticket
        ticket.bookTicket(movieName, seatNumber, price);
        
        // Display the ticket details
        ticket.displayTicketDetails();
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
