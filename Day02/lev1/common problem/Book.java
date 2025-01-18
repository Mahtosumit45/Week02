public class Book {

// Main method for testing
    public static void main(String[] args) {
        // Creating a book object using the default constructor
        Book defaultBook = new Book();
        System.out.println(defaultBook);

        // Creating a book object using the parameterized constructor
        Book specificBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println(specificBook);
    }

    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method for string representation
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    
}
