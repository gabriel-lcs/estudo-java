package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.print("Holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        double withDrawLimit = scanner.nextDouble();

        Account acc = new Account(number, name, initialBalance, withDrawLimit);

        try {
            System.out.printf("%nEnter amount for withdraw: ");
            double withdraw = scanner.nextDouble();
            acc.withdraw(withdraw);

            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (DomainException e){
            System.out.printf("Withdraw error: %s%n", e.getMessage());
        }

        scanner.close();

    }
}
