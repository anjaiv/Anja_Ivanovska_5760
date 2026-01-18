package ass1;

public abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    protected int language; // пример: 1=MK, 2=EN, 3=DE ...

    // Constructor без параметри
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.language = 0;
    }

    // Constructor со параметри
    public Book(String title, String author, double price, int language) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.language = language;
    }

    // Getters/Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getBasePrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getLanguage() { return language; }
    public void setLanguage(int language) { this.language = language; }

    // Abstract methods
    public abstract void printAttributes();
    public abstract double getPrice();
}

