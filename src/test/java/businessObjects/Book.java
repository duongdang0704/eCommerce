package businessObjects;

public class Book{
    String Publisher;
    String Language;
    String ISBN_10;
    String ISBN_13;
    String ItemWeight;
    String Dimension;
    String Paperback;

    public Book(String title, String price, String publisher, String language, String paperback, String ISBN_10, String ISBN_13, String itemWeight, String dimension) {
        this.Publisher = publisher;
        this.Language = language;
        this.ISBN_10 = ISBN_10;
        this.ISBN_13 = ISBN_13;
        this.ItemWeight = itemWeight;
        this.Dimension = dimension;
        this.Paperback = paperback;
    }
}
