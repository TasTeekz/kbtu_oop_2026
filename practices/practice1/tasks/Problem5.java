package practices.practice1.tasks;

public class Problem5 {
    public static void main(String[] args) {
        double initialBalance = 1000.0;
        double interestRate = 0.05;

        double interest = initialBalance * interestRate;
        double newBalance = initialBalance + interest;

        System.out.println("initial balance: " + initialBalance);
        System.out.println("interest rate: " + (interestRate * 100) + "%");
        System.out.println("new balance: " + newBalance);
    }
}
