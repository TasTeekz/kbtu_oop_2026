package lab1;

class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0.0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void addValue(double value) {
        sum += value;
        count++;
        if (count == 1 || value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    public double getMaximum() {
        return max;
    }
}
