package labs.lab2.problem4;

import labs.lab2.problem4.model.Circuit;
import labs.lab2.problem4.model.Parallel;
import labs.lab2.problem4.model.Resistor;
import labs.lab2.problem4.model.Series;

public class Main {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        System.out.printf("equivalent resistance: %.4f Ohm\n", circuit.getResistance());

        circuit.applyPotentialDiff(24.0);
        System.out.printf("potential difference: %.2f V\n", circuit.getPotentialDiff());
        System.out.printf("current: %.4f A\n", circuit.getCurrent());
        System.out.printf("power: %.4f W\n", circuit.getPower());
    }

}
