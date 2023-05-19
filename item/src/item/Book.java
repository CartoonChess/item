package item;

public class Book extends Item {
    private int pageCount;
    // TODO: "date" type?
    private String copyrightDate;

    public Book(String title, String description, double price, int pageCount, String copyrightDate) {
        // this.title = title;
        setTitle(title);
        this.description = description;
        this.price = price;
        this.pageCount = pageCount;
        this.copyrightDate = copyrightDate;
    }

    public String toString() {
        // Show price to two decimal places
        String priceFormatted = String.format("%.2f", price);
        return "\"" + getTitle() + "\"\n" + description + "\n" + "(" + pageCount + " pages. $" + priceFormatted + ". © " + copyrightDate + ".)";
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