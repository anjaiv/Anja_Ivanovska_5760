// Base class Animal
class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method onomatopoeia() to be overridden by subclasses
    public void onomatopoeia() {
        System.out.println("There is no onomatopoeia for " + name + ".");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " says: Woof!");
    }
}

// Subclass Lion extending Animal
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " says: Roar!");
    }
}

// Subclass Frog extending Animal
class Frog extends Animal {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " says: Ribbit!");
    }
}

// Subclass SaraMountainDog extending Dog
class SaraMountainDog extends Dog {
    public SaraMountainDog(String name) {
        super(name);
    }

    public void traits() {
        System.out.println(name + " is strong, loyal, and has a thick coat.");
    }
}

// Main class to test polymorphism and instanceof
public class AnimalKingdom {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[5];
        zoo[0] = new Dog("Buddy");
        zoo[1] = new Lion("Simba");
        zoo[2] = new Frog("Freddy");
        zoo[3] = new SaraMountainDog("Max");
        zoo[4] = new Animal("GenericAnimal");

        for (Animal animal : zoo) {
            animal.onomatopoeia();
            if (animal instanceof SaraMountainDog) {
                ((SaraMountainDog) animal).traits();
            }
        }
    }
}
