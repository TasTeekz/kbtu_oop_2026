package lab3.problem1.model;

public class Duck extends Bird implements Flyable {

    public Duck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Duck flies");
    }

    public void makeSound() {
        System.out.println("Quack");
    }
}
