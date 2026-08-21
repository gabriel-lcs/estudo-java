package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    static void main() {

        Account acc = new Account(0.0, "Alex", 1);
        BusinessAccount bacc = new BusinessAccount(0.0, "Maria", 1002, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(0.0, "Bob", 1003, 200.0);
        Account acc3 = new SavingsAccount(0.0, "Anna", 1004, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // ------------------------------------

        Account acc6 = new Account(1000.0, "Alex", 1001);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1000.0, "Anna", 1002, 0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1000.0, "Bob", 1003, 500.0);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());
    }
}
