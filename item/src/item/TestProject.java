package item;

public class TestProject {
    public static void main(String[] args) {
        // // Create books
        // Book b1 = new Book("Java Book", "Laing", 200.0, 1016, "11-20-2020");
        // Book b2 = new Book("JavaScript Redefined", "Brooks", 55.5, 390, "");
        // Book b3 = new Book("Perl, Python & PHP in Practice", "Pattington", 129.99, 3308, "");
        // Book b4 = new Book("Swift for Dummies", "Jobs", 15.0, 99, "");
        // Book b5 = new Book("The TypeScript Revolution", "Koo", 35.34, 312, "");

        // // Create movies and CDs
        // Movie m1 = new Movie("ET", "ET was from Jupiter", 6.0, 115);
        // Movie m2 = new Movie("Parasite", "THrills and chills for two families", 8.55, 131);
        // CD c1 = new CD("Best", "Xcompany", 15.0, 12);
        // CD c2 = new CD("Thursday's Child", "TXT", 19.99, 5);

        // // Create array to contain all items
        // Item[] ar = new Item[9];
        
        // Creates an Item array of size 9 while simultaneously instantiating nine items
        Item[] ar = {
            new Book("Java Book", "Laing", 200.0, 1016, "11-20-2020"),
            new Book("JavaScript Redefined", "Brooks", 55.5, 390, ""),
            new Book("Perl, Python & PHP in Practice", "Pattington", 129.99, 3308, ""),
            new Book("Swift for Dummies", "Jobs", 15.0, 99, ""),
            new Book("The TypeScript Revolution", "Koo", 35.34, 312, ""),
            new Movie("ET", "ET was from Jupiter", 6.0, 115),
            new Movie("Parasite", "THrills and chills for two families", 8.55, 131),
            new CD("Best", "Xcompany", 15.0, 12),
            new CD("Thursday's Child", "TXT", 19.99, 5)
        };

        for(Item aItem : ar) {
            System.out.println(aItem);
        }
    }
}