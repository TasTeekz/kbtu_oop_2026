package labs.lab1.tasks;

import java.util.Scanner;
import labs.lab1.models.Data;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("enter number (q to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("invalid input. enter a number or 'q' to quit.");
            }
        }

        scanner.close();

        System.out.println("avg = " + data.getAverage());
        System.out.println("max = " + data.getMaximum());
    }
}
