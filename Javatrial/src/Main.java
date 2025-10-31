
public class Main {
    public static void main(String[] args) {
        Cookie regular = new Cookie(50.0, "Round");
        regular.print();

        System.out.println();

        ChocolateCookie choco = new ChocolateCookie(60.0, "Square", 45.5);
        choco.print();

        System.out.println();

        ChocolateCookieWithExtras deluxe = new ChocolateCookieWithExtras(70.0, "Heart", 60.0, "Hazelnuts");
        deluxe.print();
    }
}

