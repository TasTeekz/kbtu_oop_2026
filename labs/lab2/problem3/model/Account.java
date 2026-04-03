package lab2.problem3.model;

public class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            return false;

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0)
            return false;

        if (amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public boolean transfer(double amount, Account other) {
        if (withdraw(amount))
            return other.deposit(amount);

        return false;

    }

    @Override
    public String toString() {
        return String.format("[acc %d] balance: $%.2f", accountNumber, balance);
    }

    public final void print() {
        System.out.println(toString());
    }
}
