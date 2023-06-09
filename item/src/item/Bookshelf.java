package item;

public class Bookshelf {
    private String name;
    // Limit of five books
    private static final int CAPACITY = 5;
    private Book[] books = new Book[CAPACITY];

    public Bookshelf(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
         // Don't allow adding a book if shelf is full
        if (this.isFull()) {
            System.out.println("Cannot add book: Shelf is full.");
            return;
        }

        // We will change this to match the first empty position found
        int emptyIndex = 0;

        // Check each index for being a duplicate or being empty
        for (int i = 0; i < CAPACITY; i++) {
            if (books[i] == book) {
                // Don't allow adding a book if duplicate exists
                System.out.println("Cannot add book: Shelf contains duplicate.");
                return;
            } else if (books[i] == null) {
                emptyIndex = i;
            }
        }

        // Add book in first empty position found
        books[emptyIndex] = book;
    }

    public void removeBook(int i) {
        // This effectively does nothing if there is no book at the given position
        books[i] = null;
    }

    public boolean isFull() {
        // If any position is empty, return false
        for (Book book : books) {
            if (book == null) {
                return false;
            }
        }
        // If five books, return true
        return true;
    }

    public boolean isEmpty() {
        // If any book is on the shelf, return false
        for (Book book : books) {
            if (book != null) {
                return false;
            }
        }
        // If no books, return true
        return true;
    }

    public String toString() {
        // Create a string with each book's details
        StringBuilder out = new StringBuilder();
        out.append("Bookshelf name: " + name + "\n\n");
        for (Book book : books) {
            // Only add to string if there's a book in that position
            if (book != null) {
                out.append(book + "\n\n");
            }
        }

        // Return all book details or a message that the shelf is empty
        if (out.length() > 0) {
            // Make sure to remove the trailing linebreaks
            return out.toString().trim();
        } else {
            return "Bookshelf is empty.";
        }
    }
}