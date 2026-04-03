package lab3.problem2.model;

public class Car implements Moveable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println(brand + " car drives on the road");
    }
}
