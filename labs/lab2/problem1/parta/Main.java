package labs.lab2.problem1.parta;

import labs.lab2.problem1.parta.model.*;

public class Main {
    public static void main(String[] args) {
        Shape3D cube = new Cube(3);
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D sphere = new Sphere(7);

        System.out.println(cube.getVolume());
        System.out.println(cube.getSurfaceArea());

        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getSurfaceArea());

        System.out.println(sphere.getVolume());
        System.out.println(sphere.getSurfaceArea());
    }
}
