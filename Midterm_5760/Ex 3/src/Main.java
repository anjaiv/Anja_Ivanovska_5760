public class AnimalKingdom {
    public static void main(String[] args) {
// Create an array of Animal references (polymorphism)
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", "Dog", "Golden Retriever");
        animals[1] = new Cat("Whiskers", "Cat", "White");
        animals[2] = new Dog("Max", "Dog", "Bulldog");

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
            System.out.println();
        }
    }
}

class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }


    public void makeSound() {
        System.out.println("The " + species + " makes a generic sound.");
    }


    public void displayInfo() {
        System.out.println("Animal: " + name + ", Species: " + species);
    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


class Cat extends Animal {
    private String color;

    public Cat(String name, String species, String color) {
        super(name, species);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }
}