package practices.practice4.service;

import practices.practice4.model.CanHavePizza;
import practices.practice4.model.Person;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
        }
        return true;
    }
}
