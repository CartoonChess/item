package item;

public class Bookshelf_old {
    private String name;
    // Limit of five books
    private static final int capacity = 5;
    private Book[] books = new Book[capacity];

    public void addBook(Book book) {
        // TODO: Better implementation?
        // Don't allow adding a book if shelf is full
        if (this.isFull()) {
            System.out.println("Cannot add book: Shelf is full.");
            return;
        }

        // Add book in first empty position
        for (int i = 0; i < capacity; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public void removeBook(int index) {
        // TODO: logic
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
        // TODO: use StringBuilder isntead for efficiency
        // TODO: skip null items
        String out = "";
        for (Book book : books) {
            out += book + "\n\n";
        }
        return out;
    }
}