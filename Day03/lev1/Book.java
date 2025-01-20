public class Book {
    // Static variable shared across all books
    private static String libraryName = "Central Library";

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable to ensure the unique identifier cannot be changed

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayDetails() {
        if (this instanceof Book) { // Check if the object is an instance of the Book class
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Object is not an instance of the Book class.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Display the library name using the static method
        Book.displayLibraryName();

        // Create a new Book object
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");

        // Display details of the book
        book1.displayDetails();

        // Create another object that is not a Book
        Object obj = new Object();

        // Check if the object is an instance of Book before attempting to display details
        if (obj instanceof Book) {
            ((Book) obj).displayDetails();
        } else {
            System.out.println("The provided object is not a Book instance.");
        }
    }
}
