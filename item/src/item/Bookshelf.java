package item;

public class Bookshelf {
    private String name;
    // Limit of five books
    private Book[] books;

    public void addBook(Book book) {
        // TODO: logic
        //if self.isFull {error
        
        Book[] updatedBooks = {new Book("title", "desc", 0, 0, "copyr")};
        books = updatedBooks;

        System.arra
    }

    public void removeBook(int index) {
        // TODO: logic
    }

    public boolean isFull() {
        if (books.length == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        // TODO: Do we need a length check?
        // if (books.length == 0) {
        if (books == null) {
            return true;
        } else {
            return false;
        }
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