package lab2.problem4.model;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;

    public Parallel(Circuit c1, Circuit c2) {
        if (c1 == null || c2 == null) {
            throw new IllegalArgumentException();
        }
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return 1.0 / (1.0 / c1.getResistance() + 1.0 / c2.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return c1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        if (V < 0) {
            throw new IllegalArgumentException();
        }
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return String.format("parallel | resistance: %.2f | potential difference: %.2f", getResistance(),
                getPotentialDiff());
    }

}
