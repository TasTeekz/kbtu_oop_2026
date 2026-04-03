package lab3.problem1;

import lab3.problem1.model.Duck;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Donald");

        duck.fly();
        duck.eat();
        duck.makeSound();
    }
}