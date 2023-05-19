package item;

public class CD extends Item {
    private int trackCount;

    public CD(String title, String description, double price, int trackCount) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.trackCount = trackCount;
    }

    // TODO: getters/setters
}