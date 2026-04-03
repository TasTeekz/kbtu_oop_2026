package lab2.problem3.model;

import java.util.*;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public boolean addAccount(Account account) {
        return openAccount(account);
    }

    public boolean openAccount(Account account) {
        if (account == null) {
            return false;
        }

        if (getAccount(account.getAccountNumber()) != null) {
            return false;
        }

        accounts.add(account);
        return true;
    }

    public boolean closeAccount(int accountNumber) {
        Iterator<Account> iterator = accounts.iterator();

        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getAccountNumber() == accountNumber) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount savingsAccount) {
                savingsAccount.addInterest();
            } else if (account instanceof CheckingAccount checkingAccount) {
                checkingAccount.deductFee();
            }
        }
    }

    public Vector<Account> getAccounts() {
        return new Vector<>(accounts);
    }
}
