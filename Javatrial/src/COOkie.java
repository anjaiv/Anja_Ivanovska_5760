class Cookie {
    double weight;
    String shape;

    Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }

    void print() {
        System.out.println("Cookie shape: " + shape);
        System.out.println("Cookie weight: " + weight + "g");
    }
}

class ChocolateCookie extends Cookie {
    double percentChocolate;

    ChocolateCookie(double weight, String shape, double percentChocolate) {
        super(weight, shape);
        this.percentChocolate = percentChocolate;
    }

    @Override
    void print() {
        System.out.println("Chocolate Cookie shape: " + shape);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Chocolate percentage: " + percentChocolate + "%");
    }
}

class ChocolateCookieWithExtras extends ChocolateCookie {
    String extra;

    ChocolateCookieWithExtras(double weight, String shape, double percentChocolate, String extra) {
        super(weight, shape, percentChocolate);
        this.extra = extra;
    }

    @Override
    void print() {
        System.out.println("Chocolate Cookie with Extras shape: " + shape);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Chocolate percentage: " + percentChocolate + "%");
        System.out.println("Extras: " + extra);
    }
}
