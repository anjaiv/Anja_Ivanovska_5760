package ass1;

public class SFBook extends Book {
    private int publishYear;
    private boolean bestSeller;

    // Constructor без параметри
    public SFBook() {
        super();
        this.publishYear = 0;
        this.bestSeller = false;
    }

    // Constructor со параметри
    public SFBook(String title, String author, double price, int language, int publishYear, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.bestSeller = bestSeller;
    }

    public int getPublishYear() { return publishYear; }
    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }

    public boolean isBestSeller() { return bestSeller; }
    public void setBestSeller(boolean bestSeller) { this.bestSeller = bestSeller; }

    @Override
    public void printAttributes() {
        System.out.println("=== SFBook ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + language);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Best Seller: " + bestSeller);
    }

    @Override
    public double getPrice() {
        // Задачата не дава формула, па најчисто: врати ја price.
        // Ако професорот бара правило, лесно се менува тука.
        return price;
    }
}
