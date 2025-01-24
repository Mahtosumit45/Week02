// Example usage
public class LibraryManagement {
    public static void main(String[] args) {
        Author book1 = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");
        book1.displayInfo();
    }
}

// Superclass Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author (inherits from Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        // Initialize superclass with title and publication year
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display book details
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

