package labs.lab1.models;

public class Temperature {
    private double value;
    private Scale scale;

    public Temperature(double value, Scale scale) {
        this.value = value;
        this.scale = scale;
    }

    public Temperature(double value) {
        this(value, Scale.CELCIUS);
    }

    public Temperature(Scale scale) {
        this(0.0, scale);
    }

    public Temperature() {
        this(0.0, Scale.CELCIUS);
    }

    public double degreesCelcius() {
        if (scale.equals(Scale.CELCIUS))
            return value;
        return 5 * (value - 32) / 9;
    }

    public double degreesFahrenheit() {
        if (scale.equals(Scale.FAHRENHEIT))
            return value;
        return 5 / 9 * value + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, Scale scale) {
        this.value = value;
        this.scale = scale;
    }

    public Scale getScale() {
        return scale;
    }

    public double getValue() {
        return value;
    }

}
