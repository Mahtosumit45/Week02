public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Book2() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow a book
    public String borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            return "You have successfully borrowed \"" + title + "\" by " + author + ".";
        } else {
            return "Sorry, \"" + title + "\" by " + author + " is currently not available.";
        }
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + ", isAvailable=" + isAvailable + "}";
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Creating books
        Book2 book1 = new Book2("1984", "George Orwell", 9.99, true);
        Book2 book2 = new Book2("The Great Gatsby", "F. Scott Fitzgerald", 10.99, false);

        // Borrowing books
        System.out.println(book1.borrowBook()); // Successful borrow
        System.out.println(book1.borrowBook()); // Already borrowed

        System.out.println(book2.borrowBook()); // Not available

        // Printing book details
        System.out.println(book1);
        System.out.println(book2);
    }
}
