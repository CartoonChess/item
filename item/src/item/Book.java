package item;

public class Book extends Item {
    private int pageCount;
    // TODO: "date" type?
    private String copyrightDate;

    public Book(String title, String description, double price, int pageCount, String copyrightDate) {
        // Use the Item constructor for common properties
        super(title, description, price);
        // Assign values unique to Book
        this.pageCount = pageCount;
        this.copyrightDate = copyrightDate;
    }

    public String toString() {
        // Show price to two decimal places
        String priceFormatted = String.format("%.2f", getPrice());
        return "\"" + getTitle() + "\"\n" + getDescription() + "\n" + "(" + pageCount + " pages. $" + priceFormatted + ". © " + copyrightDate + ".)";
    }

    // Getters

    public int getPageCount() {
        return pageCount;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    // Setters

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }
}