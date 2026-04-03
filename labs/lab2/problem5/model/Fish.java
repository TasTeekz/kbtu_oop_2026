package lab2.problem5.model;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "blub";
    }

}
