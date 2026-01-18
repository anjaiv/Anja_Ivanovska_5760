package ass1;

public class AdventureBook extends Book {
    private int publishYear;
    private boolean childrenBook;

    // Constructor без параметри
    public AdventureBook() {
        super();
        this.publishYear = 0;
        this.childrenBook = false;
    }

    // Constructor со параметри
    public AdventureBook(String title, String author, double price, int language, int publishYear, boolean childrenBook) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.childrenBook = childrenBook;
    }

    public int getPublishYear() { return publishYear; }
    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }

    public boolean isChildrenBook() { return childrenBook; }
    public void setChildrenBook(boolean childrenBook) { this.childrenBook = childrenBook; }

    @Override
    public void printAttributes() {
        System.out.println("=== AdventureBook ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + language);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Children Book: " + childrenBook);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
