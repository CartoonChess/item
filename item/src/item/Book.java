package item;

public class Book extends Item {
    private int pageCount;
    // TODO: "date" type?
    private String copyrightDate;

    public Book(String title, String description, float price, int pageCount, String copyrightDate) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.pageCount = pageCount;
        this.copyrightDate = copyrightDate;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
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

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // TODO: toString
    // "returns a nicely formatted, multi-line description of the book"
    public String toString() {
       return "";
       //System.out.println(description);
    }
}