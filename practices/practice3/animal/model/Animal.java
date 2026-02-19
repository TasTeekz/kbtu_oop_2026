package practices.practice3.animal.model;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}