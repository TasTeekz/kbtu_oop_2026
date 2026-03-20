package practices.practice4.model;

public class Cat implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("cat is eating pizza");
    }
}
