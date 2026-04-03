package lab2.problem1.partc.model;

import java.util.Objects;

public class Drink {

    private String name;
    private double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Drink))
            return false;
        Drink drink = (Drink) o;
        return Double.compare(drink.volume, volume) == 0 &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }
}