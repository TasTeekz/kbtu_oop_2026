package labs.lab1.models;

public enum AccountType {
    SAVINGS(0.03), // 3%
    CHECKING(0.01), // 1%
    PREMIUM(0.05); // 5%

    private final double interestRate;

    AccountType(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}