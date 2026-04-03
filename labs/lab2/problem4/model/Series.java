package lab2.problem4.model;

public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;

    public Series(Circuit c1, Circuit c2) {
        if (c1 == null || c2 == null) {
            throw new IllegalArgumentException();
        }
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return c1.getPotentialDiff() + c2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        if (V < 0) {
            throw new IllegalArgumentException();
        }
        double totalResistance = getResistance();
        double current = V / totalResistance;
        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());
    }

    @Override
    public String toString() {
        return String.format("series | resistance: %.2f | potential difference: %.2f", getResistance(),
                getPotentialDiff());
    }

}
