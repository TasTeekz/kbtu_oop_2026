package labs.lab1.tasks;

import labs.lab1.models.Scale;
import labs.lab1.models.Temperature;

public class Problem3 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(100.0, Scale.FAHRENHEIT);
        Temperature t2 = new Temperature(0.0, Scale.CELCIUS);
        Temperature t3 = new Temperature(Scale.FAHRENHEIT);
        Temperature t4 = new Temperature();

        System.out.println("t1: " + t1.getValue() + " " + t1.getScale() +
                " = " + t1.degreesCelcius() + " CELCIUS");
        System.out.println("t2: " + t2.getValue() + " " + t2.getScale() +
                " = " + t2.degreesFahrenheit() + " FAHRENHEIT");
        System.out.println("t3: " + t3.getValue() + " " + t3.getScale() +
                " = " + t3.degreesCelcius() + " CELCIUS");
        System.out.println("t4: " + t4.getValue() + " " + t4.getScale() +
                " = " + t4.degreesFahrenheit() + " FAHRENHEIT");
    }
}
