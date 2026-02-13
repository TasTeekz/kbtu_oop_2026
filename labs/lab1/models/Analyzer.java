package labs.lab1.models;

import java.util.Scanner;

public class Analyzer {
    private final Data data;

    public Analyzer(Data data) {
        this.data = data;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or 'Q' to quit.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        scanner.close();
    }
}
