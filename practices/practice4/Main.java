package practices.practice4;

import practices.practice4.model.Cat;
import practices.practice4.model.Student;
import practices.practice4.service.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student();

        restaurant.servePizza(cat);
        restaurant.servePizza(student);
    }
}