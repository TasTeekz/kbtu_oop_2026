package lab3.problem2.model;

public interface Flyable extends Moveable {
    void takeOff();

    void land();

    int getAltitude();
}
