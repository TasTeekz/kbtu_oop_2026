package lab2.problem1.parta.model;

public class Cube extends Shape3D {
    
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getSurfaceArea() {
        return edge * edge * 6;
    }
}
