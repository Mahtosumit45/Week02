// Main class for demonstration
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("1234567890", "Java Programming", "John Doe");

        // Accessing public and private attributes
        System.out.println("Book ISBN: " + book.ISBN);
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        // Create an EBook object
        EBook ebook = new EBook("0987654321", "Advanced Java", "Alice Johnson", 1.5);

        // Display eBook details
        ebook.displayEBookDetails();
    }
}
class Book {
    // Attributes with different access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return author;
    }
}

// Subclass EBook
class EBook extends Book {
    private double fileSize; // Size of the eBook in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);          // Accessing public attribute
        System.out.println("Title: " + title);        // Accessing protected attribute
        System.out.println("Author: " + getAuthor()); // Accessing private attribute via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}


