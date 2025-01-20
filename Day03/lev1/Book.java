public class Book {

    // Static variable
    private static String libraryName = "Swami Vivekanand Library";

    // Final variable
    private final String isbn;

	 	public String title;
		public String author;


    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;  
    }
		 public static void displayLibraryName(){
			System.out.println("Library name: " + libraryName);
		}


    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
			 System.out.println("Library name: " + libraryName);
            System.out.println("Book title: " + title);
            System.out.println("Book author: " + author);
            System.out.println("Book isbn: " + isbn);
        }
    }

    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The story", "Hero Hiralal", "Abc123");
        Book book2 = new Book("Okay story", "Anshi Patel", "12acv");


       // Displaying book details
        book1.displayBookDetails();
		
        book2.displayBookDetails();


    }
}
