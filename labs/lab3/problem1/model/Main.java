package lab3.problem1.model;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Donald");

        duck.fly();        // interface
        duck.eat();        // abstract class (общий метод)
        duck.makeSound();  // реализация
    }
}