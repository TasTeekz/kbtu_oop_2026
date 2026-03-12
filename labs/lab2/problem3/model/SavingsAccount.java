package labs.lab2.problem3.model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);

        if (interestRate < 0) {
            throw new IllegalArgumentException();
        }
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) {
            throw new IllegalArgumentException();
        }
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | interest rate: %.2f%%", interestRate);
    }
}
