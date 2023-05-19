package item;

public class Movie extends Item {
    private int length; // minutes

    public Movie(String title, String description, double price, int length) {
        super(title, description, price);
        this.length = length;
    }

    // Getters and setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}