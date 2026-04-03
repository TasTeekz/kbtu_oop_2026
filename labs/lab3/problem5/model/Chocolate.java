package lab3.problem5.model;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.getWeight());
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}