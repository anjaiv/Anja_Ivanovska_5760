// Abstract class Superhero
abstract class Superhero {
    protected String heroName;

    // Constructor
    public Superhero(String heroName) {
        this.heroName = heroName;
    }

    // Abstract method fight()
    public abstract void fight();
}

// Subclass FlyingHero extending Superhero
class FlyingHero extends Superhero {
    public FlyingHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " takes to the skies and attacks from above!");
    }
}

// Subclass StrengthHero extending Superhero
class StrengthHero extends Superhero {
    public StrengthHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " uses super strength to overpower enemies!");
    }
}

// Subclass SpeedHero extending Superhero
class SpeedHero extends Superhero {
    public SpeedHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " moves at lightning speed to dodge attacks and strike swiftly!");
    }
}

// Main class to simulate the battle
public class BattleOfSuperHeroes {
    public static void main(String[] args) {
        Superhero[] heroes = new Superhero[6];
        heroes[0] = new FlyingHero("SkyMaster");
        heroes[1] = new StrengthHero("PowerPunch");
        heroes[2] = new SpeedHero("FlashBolt");
        heroes[3] = new FlyingHero("AeroStar");
        heroes[4] = new StrengthHero("IronFist");
        heroes[5] = new SpeedHero("QuickSilver");

        System.out.println("Battle of the Superheroes Begins!\n");
        for (Superhero hero : heroes) {
            hero.fight();
        }
    }
}
