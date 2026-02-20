package practices.practice3.Problem2;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Person> people = new Vector<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1) Add Person");
            System.out.println("2) Add Student");
            System.out.println("3) Add Staff");
            System.out.println("4) Show all");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            if (choice == 0) break;

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();

                people.add(new Person(name, address));
                System.out.println("Person added.");

            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter program: ");
                String program = sc.nextLine();

                int year = readInt(sc, "Enter year (int): ");
                double fee = readDouble(sc, "Enter fee (double): ");

                people.add(new Student(name, address, program, year, fee));
                System.out.println("Student added.");

            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter school: ");
                String school = sc.nextLine();

                double pay = readDouble(sc, "Enter pay (double): ");

                people.add(new Staff(name, address, school, pay));
                System.out.println("Staff added.");

            } else if (choice == 4) {
                if (people.isEmpty()) {
                    System.out.println("No records yet.");
                } else {
                    System.out.println("\n--- All records ---");
                    for (Person p : people) {
                        System.out.println(p);
                    }
                }

            } else {
                System.out.println("Unknown option.");
            }
        }

        sc.close();
        System.out.println("Program finished.");
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid double. Try again.");
            }
        }
    }
}