package ass1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SFBook> sfBooks = new ArrayList<>();
        ArrayList<AdventureBook> advBooks = new ArrayList<>();

        while (true) {
            printMenu();
            int choice = readInt(sc, "Choose option: ");

            switch (choice) {
                case 1 -> {
                    SFBook b = inputSFBook(sc);
                    sfBooks.add(b);
                    System.out.println("SF book added.\n");
                }
                case 2 -> {
                    AdventureBook b = inputAdventureBook(sc);
                    advBooks.add(b);
                    System.out.println("Adventure book added.\n");
                }
                case 3 -> {
                    ArrayList<Book> all = collectAll(sfBooks, advBooks);
                    if (all.isEmpty()) {
                        System.out.println("No books.\n");
                    } else {
                        for (Book b : all) {
                            b.printAttributes();
                            System.out.println();
                        }
                    }
                }
                case 4 -> {
                    ArrayList<Book> all = collectAll(sfBooks, advBooks);
                    if (all.isEmpty()) {
                        System.out.println("No books.\n");
                    } else {
                        Book oldest = findOldest(sfBooks, advBooks);
                        System.out.println("Oldest book:");
                        oldest.printAttributes();
                        System.out.println();
                    }
                }
                case 5 -> {
                    ArrayList<Book> all = collectAll(sfBooks, advBooks);
                    if (all.isEmpty()) {
                        System.out.println("No books.\n");
                    } else {
                        Book mostExp = findMostExpensive(sfBooks, advBooks);
                        System.out.println("Most expensive book:");
                        mostExp.printAttributes();
                        System.out.println();
                    }
                }
                case 6 -> {
                    ArrayList<Book> all = collectAll(sfBooks, advBooks);
                    if (all.isEmpty()) {
                        System.out.println("No books.\n");
                    } else {
                        double avg = averagePrice(all);
                        System.out.printf("Average price of all books: %.2f%n%n", avg);
                    }
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option.\n");
            }
        }
    }

    // ================= MENU =================
    private static void printMenu() {
        System.out.println("1. Input SF book");
        System.out.println("2. Input Adventure book");
        System.out.println("3. List all books");
        System.out.println("4. List the oldest book");
        System.out.println("5. List the most expensive book");
        System.out.println("6. List the average price of all books");
        System.out.println("7. Exit");
    }

    // ================= INPUT HELPERS =================
    private static SFBook inputSFBook(Scanner sc) {
        System.out.println("--- Input SF Book ---");
        String title = readLine(sc, "Title: ");
        String author = readLine(sc, "Author: ");
        double price = readDouble(sc, "Price: ");
        int language = readInt(sc, "Language (int): ");
        int year = readInt(sc, "Publish year: ");
        boolean bestSeller = readBoolean(sc, "Best seller (true/false): ");

        return new SFBook(title, author, price, language, year, bestSeller);
    }

    private static AdventureBook inputAdventureBook(Scanner sc) {
        System.out.println("--- Input Adventure Book ---");
        String title = readLine(sc, "Title: ");
        String author = readLine(sc, "Author: ");
        double price = readDouble(sc, "Price: ");
        int language = readInt(sc, "Language (int): ");
        int year = readInt(sc, "Publish year: ");
        boolean children = readBoolean(sc, "Children book (true/false): ");

        return new AdventureBook(title, author, price, language, year, children);
    }

    private static String readLine(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    private static int readInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Enter a valid integer.");
            }
        }
    }

    private static double readDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static boolean readBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("true")) return true;
            if (s.equals("false")) return false;
            System.out.println("Type true or false.");
        }
    }

    // ================= OPERATIONS =================
    private static ArrayList<Book> collectAll(ArrayList<SFBook> sfBooks, ArrayList<AdventureBook> advBooks) {
        ArrayList<Book> all = new ArrayList<>();
        all.addAll(sfBooks);
        all.addAll(advBooks);
        return all;
    }

    private static Book findOldest(ArrayList<SFBook> sfBooks, ArrayList<AdventureBook> advBooks) {
        Book oldest = null;
        int minYear = Integer.MAX_VALUE;

        for (SFBook b : sfBooks) {
            if (b.getPublishYear() < minYear) {
                minYear = b.getPublishYear();
                oldest = b;
            }
        }

        for (AdventureBook b : advBooks) {
            if (b.getPublishYear() < minYear) {
                minYear = b.getPublishYear();
                oldest = b;
            }
        }

        return oldest;
    }

    private static Book findMostExpensive(ArrayList<SFBook> sfBooks, ArrayList<AdventureBook> advBooks) {
        Book best = null;
        double maxPrice = -1.0;

        for (SFBook b : sfBooks) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
                best = b;
            }
        }

        for (AdventureBook b : advBooks) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
                best = b;
            }
        }

        return best;
    }

    private static double averagePrice(ArrayList<Book> all) {
        double sum = 0.0;
        for (Book b : all) sum += b.getPrice();
        return sum / all.size();
    }
}
