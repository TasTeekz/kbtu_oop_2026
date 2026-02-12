package practices.practice1.tasks;

import java.util.Scanner;

public class Problem1 {
    public static void printBoxedName(String name) {
        System.out.println("+" + "-".repeat(name.length() + 2) + "+");
        System.out.println("| " + name + " |");
        System.out.println("+" + "-".repeat(name.length() + 2) + "+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        scanner.close();

        printBoxedName(name);
    }
}