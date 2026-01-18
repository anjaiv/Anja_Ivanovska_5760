public class TaleOfTheEgg {
    public static void main(String[] args) {
        // Instantiate an Egg object
        Egg regularEgg = new Egg();
        regularEgg.EGG();
        regularEgg.print();

        System.out.println();

        // Instantiate an OstrichEgg object
        OstrichEgg ostrichEgg = new OstrichEgg();
        ostrichEgg.EGG();
        ostrichEgg.print();
    }
}
