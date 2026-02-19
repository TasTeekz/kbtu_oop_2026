package practices.practice3.animal.app;

import practices.practice3.animal.model.Animal;
import practices.practice3.animal.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Animal animal = new Animal("Capybara", 3);
        animals.add(animal);

        Dog dog1 = new Dog("Aktos", 3, "Beagle");
        Dog dog2 = new Dog("Money", 2, "Siberian Husky");
        animals.add(dog1);
        animals.add(dog2);

        System.out.println("=== Demonstrating Polymorphism ===\n");

        for (Animal _animal : animals) {
            System.out.println("--- Animal Information ---");
            _animal.getInfo();
            _animal.makeSound();
            _animal.eat();
            _animal.eat("meat");
            System.out.println();
        }
    }
}