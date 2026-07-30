package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double deposit = 0.0;

        System.out.print("Enter account number: ");
        int numberAcc = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char escolha = scanner.nextLine().charAt(0);

        if (escolha == 'y'){
            System.out.print("Enter initial deposit value: ");
            deposit = scanner.nextDouble();
        }

        Account account = new Account(numberAcc, deposit, name);

        System.out.printf("%nAccount data: %n");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        deposit = scanner.nextDouble();

        account.deposito(deposit);

        System.out.printf("Updated account data: %n");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        deposit = scanner.nextDouble();

        account.saque(deposit);

        System.out.printf("Updated account data: %n");
        System.out.println(account);
    }
}
