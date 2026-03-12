package labs.lab2.problem3;

import labs.lab2.problem3.model.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account = new Account(1001);
        SavingsAccount savings = new SavingsAccount(1002, 5.0);
        CheckingAccount checking = new CheckingAccount(1003);
        CheckingAccount checking2 = new CheckingAccount(1004);

        bank.openAccount(account);
        bank.openAccount(savings);
        bank.openAccount(checking);
        bank.openAccount(checking2);

        account.deposit(300);
        savings.deposit(1000);
        checking.deposit(100);
        checking.withdraw(10);
        checking.deposit(5);
        checking.withdraw(5);
        checking2.deposit(50);

        bank.update();

        for (Account current : bank.getAccounts()) {
            current.print();
        }

        bank.closeAccount(1004);
    }
}
