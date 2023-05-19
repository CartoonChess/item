package item;

public class Book extends Item {
    private int pageCount;
    // TODO: "date" type?
    private String copyrightDate;

    public Book(String title, String description, double price, int pageCount, String copyrightDate) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.pageCount = pageCount;
        this.copyrightDate = copyrightDate;
    }

    public String toString() {
        return "\"" + title + "\"\n" + description + "\n" + "(" + pageCount + " pages. $" + price + ". © " + copyrightDate + ".)";
    }

    // Getters

    // TODO: Move first three to Item class

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }
}