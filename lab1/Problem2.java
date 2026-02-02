package lab1;

public class Problem2 {
    public static void main(String[] args) {
        // static information
        System.out.println("minimum balance required: $" + BankAccount.getMinimumBalance() + "\n");

        // create accounts with different constructors
        BankAccount acc1 = new BankAccount("acc001", AccountType.SAVINGS, 1000.0);
        BankAccount acc2 = new BankAccount("acc002", 500.0); // default CHECKING type
        BankAccount acc3 = new BankAccount("acc003", AccountType.PREMIUM, 5000.0);

        System.out.println("\ntotal accounts: " + BankAccount.getTotalAccounts());
        System.out.println();

        // method overloading
        acc1.deposit(200.0);
        acc1.deposit(300.0, "salary");
        acc1.deposit(150.0, "scolarship", 12345);
        System.out.println();

        // apply interest (uses enum)
        acc1.applyInterest();
        acc2.applyInterest();
        acc3.applyInterest();

        // display acc information
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}