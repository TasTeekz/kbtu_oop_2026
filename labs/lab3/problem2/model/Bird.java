package lab3.problem2.model;

public class Bird implements Flyable {
    private String name;
    private int altitude;

    public Bird(String name) {
        this.name = name;
        this.altitude = 0;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving through the air");
    }

    @Override
    public void takeOff() {
        altitude = 100;
        System.out.println(name + " takes off from the ground");
    }

    @Override
    public void land() {
        altitude = 0;
        System.out.println(name + " lands on the ground");
    }

    @Override
    public int getAltitude() {
        return altitude;
    }
}
