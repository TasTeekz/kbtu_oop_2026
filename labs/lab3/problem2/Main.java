package lab3.problem2;

import lab3.problem2.model.*;

public class Main {
    public static void main(String[] args) {
        Moveable[] movers = { new Bird("eagle"), new Airplane("boeing"), new Car("cobalt") };
        for (Moveable m : movers) {
            m.move();
        }

        Flyable[] flyers = { new Bird("sparrow"), new Airplane("airbus") };
        for (Flyable f : flyers) {
            f.takeOff();
            f.move();
            System.out.println("altitude: " + f.getAltitude());
            f.land();
            System.out.println();
        }
    }
}
