
import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    // Parameterized constructor
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // Getter methods for book attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Create a HashMap to store book entries
        Map<Integer, Book> bookMap = new HashMap<>();

        // Instantiate two Book objects
        Book book1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book book2 = new Book(102, "To Kill a Mockingbird", "Harper Lee", 3);

        // Add books to the library
        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);

        // Check if a particular book name is present in the map
        String searchBookName = "The Great Gatsby";
        if (bookMap.values().stream().anyMatch(book -> book.getName().equals(searchBookName))) {
            System.out.println(searchBookName + " is present in the library.");
        } else {
            System.out.println(searchBookName + " is not found.");
        }

        // Remove the value associated with a particular key (book ID)
        int removeBookId = 102;
        if (bookMap.containsKey(removeBookId)) {
            Book removedBook = bookMap.remove(removeBookId);
            System.out.println("Removed book: " + removedBook.getName());
        } else {
            System.out.println("Book with ID " + removeBookId + " not found.");
        }

        // Print the updated collection of books
        System.out.println("\nUpdated collection of books:");
        for (Book book : bookMap.values()) {
            System.out.println("ID: " + book.getId() + ", Name: " + book.getName() +
                    ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        }
    }
}