package labs.lab2.problem3.model;

public class CheckingAccount extends Account {

    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    private int transactionCount;

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public boolean deposit(double amount) {
        if (!super.deposit(amount)) {
            return false;
        }
        transactionCount++;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (!super.withdraw(amount)) {
            return false;
        }
        transactionCount++;
        return true;
    }

    public boolean deductFee() {
        if (transactionCount <= FREE_TRANSACTIONS) {
            transactionCount = 0;
            return true;
        }

        int paidTransactions = transactionCount - FREE_TRANSACTIONS;
        double totalFee = paidTransactions * TRANSACTION_FEE;
        boolean success = super.withdraw(totalFee);

        if (success) {
            transactionCount = 0;
        }

        return success;
    }

    public boolean deductFee(double fee) {
        if (fee < 0) {
            return false;
        }
        if (transactionCount > FREE_TRANSACTIONS) {
            return super.withdraw(fee);
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | transactions: %d/%d", transactionCount, FREE_TRANSACTIONS);
    }

}
