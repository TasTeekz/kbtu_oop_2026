package practices.practice3.Problem1;

public class Animal {
    protected String species;

    public Animal() {
        this.species = "Unknown";
    }

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating");
    }

    public void sleep() {
        System.out.println(species + " is sleeping");
    }

    public void poop() {
        System.out.println(species + " is pooping");
    }

    public void whatIsThisEating() {
        System.out.println(species + " is eating something");
    }

    public void whatIsThisEating(String food) {
        System.out.println(species + " is eating " + food);
    }
}