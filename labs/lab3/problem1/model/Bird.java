package lab3.problem1.model;

public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public abstract void makeSound();
}
