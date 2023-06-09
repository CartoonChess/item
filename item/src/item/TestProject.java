package item;

public class TestProject {
    // Prints contents of an Item array
    private static void printItemArray(Item[] ar) {
        for(Item aItem : ar) {
            System.out.println(aItem + "\n");
        }
    }
    public static void main(String[] args) {
        // Creates an Item array of size 9 while simultaneously instantiating nine items
        Item[] ar = {
            new Book("Java Book", "Laing", 200.0, 1016, "11-20-2020"),
            new Book("JavaScript Redefined", "Brooks", 55.5, 390, "12-04-1995"),
            new Book("Perl, Python & PHP in Practice", "Pattington", 129.99, 3308, "09-09-1999"),
            new Book("Swift for Dummies", "Jobs", 15.0, 99, "07-17-2020"),
            new Book("The TypeScript Revolution", "Koo", 35.34, 312, "05-21-2023"),
            new Movie("ET", "ET was from Jupiter", 6.0, 115),
            new Movie("Parasite", "Thrills and chills for two families", 8.55, 131),
            new CD("Best", "Xcompany", 15.0, 12),
            new CD("Thursday's Child", "TXT", 19.99, 5)
        };

        // Print contents (all elements) of Item array ar
        printItemArray(ar);

        Bookshelf shelf = new Bookshelf("My Bookshelf");

        // Loop for testing functions (see assignment, question 9)
        for (int i = 0; i < ar.length; i++) {
            // Perform a different function, depending on the object type
            if (ar[i] instanceof Book) {
                System.out.println("Pages: " + ((Book) ar[i]).getPageCount());
                // Add book to shelf
                shelf.addBook(((Book) ar[i]));
            } else if (ar[i] instanceof Movie) {
                System.out.println("Minutes: " + ((Movie) ar[i]).getLength());
            } else if (ar[i] instanceof CD) {
                System.out.println("Tracks: " + ((CD) ar[i]).getTrackCount());
            }
        }

        // Show shelf contents
        System.out.println("\n" + shelf + "\n");

        // Test book adding functions

        // Create duplicate of existing book
        Book aNew = new Book("Java Book", "Laing", 200.0, 1016, "11-20-2020");
        // First, an error because the shelf is full
        shelf.addBook(aNew);
        // Remove a book (not the one that matches the duplicate)
        shelf.removeBook(4);
        // Next, an error because a duplicate book is already on shelf
        shelf.addBook(aNew);
        // Remove book that matches duplicate (it's the first one)
        shelf.removeBook(0);
        // Add (what was) the duplicate book to the shelf
        shelf.addBook(aNew);

        System.out.println();

        // Print contents (all elements) of Item array ar, again
        printItemArray(ar);
    }
}