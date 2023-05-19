package item;

public class CD extends Item {
    private int trackCount;

    public CD(String title, String description, double price, int trackCount) {
        super(title, description, price);
        this.trackCount = trackCount;
    }

    // Getters and setters

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }
}