package item;

public class TestProject {
    public static void main(String[] args) throws Exception {
        // TODO: Cleanup
        // Bookshelf shelf = new Bookshelf();
        // // System.out.println(shelf);
        // System.out.println(shelf.isEmpty());
        // shelf.addBook(new Book("title", "desc", 0, 0, "copyr"));
        // System.out.println(shelf.isEmpty());
        // System.out.println(shelf);

        Bookshelf_old shelf = new Bookshelf_old();
        System.out.println(shelf);
        System.out.println(shelf.isEmpty());
        shelf.addBook(new Book("title", "desc", 0, 0, "copyr"));
        System.out.println(shelf.isEmpty());
        System.out.println(shelf);
    }
}