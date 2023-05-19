package item;

public class Movie extends Item {
    private int length; // minutes

    public Movie(String title, String description, double price, int length) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.length = length;
    }

    // TODO: getters/setters
}