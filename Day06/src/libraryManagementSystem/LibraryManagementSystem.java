package libraryManagementSystem;

// Main class to demonstrate functionality
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of LibraryItem objects
        LibraryItem[] items = {
                new Book("B001", "Java Programming", "John Doe"),
                new Magazine("M001", "Tech Monthly", "Editorial Team"),
                new DVD("D001", "Inception", "Christopher Nolan")
        };

        // Demonstrating polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available for Reservation: " + reservableItem.checkAvailability());
                reservableItem.reserveItem();
                System.out.println("Available for Reservation: " + reservableItem.checkAvailability());
            }

            System.out.println("---------------------------");
        }
    }
}
