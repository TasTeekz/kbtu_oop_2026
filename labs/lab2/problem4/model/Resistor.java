package lab2.problem4.model;

public class Resistor extends Circuit {

    private double resistance;
    private double potentialDiff;

    public Resistor(double resistance) {
        if (resistance < 0) {
            throw new IllegalArgumentException();
        }
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDiff;
    }

    @Override
    public void applyPotentialDiff(double V) {
        if (V < 0) {
            throw new IllegalArgumentException();
        }
        this.potentialDiff = V;
    }
}
