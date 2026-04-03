package lab3.problem2.model;

public class Airplane implements Flyable {
    private String model;
    private int altitude;

    public Airplane(String model) {
        this.model = model;
        this.altitude = 0;
    }

    @Override
    public void move() {
        System.out.println(model + " is flying at altitude " + altitude);
    }

    @Override
    public void takeOff() {
        altitude = 10000;
        System.out.println(model + " takes off from the runway");
    }

    @Override
    public void land() {
        altitude = 0;
        System.out.println(model + " lands on the runway");
    }

    @Override
    public int getAltitude() {
        return altitude;
    }
}
