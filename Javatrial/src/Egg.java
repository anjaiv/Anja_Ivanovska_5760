// Parent class Egg
class Egg {
    // Method EGG() displaying a common message
    public void EGG() {
        System.out.println("Each egg has an albumen and a yolk.");
    }

    // Method print() displaying egg properties
    public void print() {
        System.out.println("The egg is a nutritional product.");
    }
}

// Subclass OstrichEgg inheriting from Egg
class OstrichEgg extends Egg {
    @Override
    public void EGG() {
        System.out.println("The albumen and yolk of an ostrich egg are the largest.");
    }
}
