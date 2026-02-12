package labs.lab1.models;

public class BankAccount {
    // final non-static (read-only)
    private final String accountNumber;
    private final AccountType accountType;

    // non-final non-static
    private double balance;

    // static non-final (shared)
    private static int totalAccounts = 0;

    // static final (constant shared)
    private static final double MINIMUM_BALANCE = 100.0;
    private static final String BANK_NAME = "oop_lab1_bank";

    // init block
    {
        totalAccounts++;
        System.out.println("creating account #" + totalAccounts);
    }

    // static init block
    static {
        System.out.println("BankAccount class loaded.\nbank: " + BANK_NAME + "\n");
    }

    // constructor (usage "this" #1 - assign params to fields)
    public BankAccount(String accountNumber, AccountType accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // constructor (usage "this" #2 - to call another constructor)
    public BankAccount(String accountNumber, double initialBalance) {
        this(accountNumber, AccountType.CHECKING, initialBalance);
    }

    // method overloading
    // deposit() - with 1 param
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: $" + amount);
        }
    }

    // deposit() - with 2 params
    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: $" + amount + " - " + description);
        }
    }

    // deposit() - with 3 params
    public void deposit(double amount, String description, int referenceNumber) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: $" + amount + " - " + description +
                    " (ref: " + referenceNumber + ")");
        }
    }

    public void applyInterest() {
        double interest = balance * accountType.getInterestRate();
        balance += interest;
        System.out.println("interest applied: $" + interest);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "\n--- account info ---" +
                "\naccount number: " + accountNumber +
                "\naccount type: " + accountType +
                "\nbalance: $" + balance +
                "\ninterest rate: " + (accountType.getInterestRate() * 100) + "%";
    }
}
