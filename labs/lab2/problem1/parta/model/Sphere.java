package lab2.problem1.parta.model;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
