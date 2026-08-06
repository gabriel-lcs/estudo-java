package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double qntDinheiro = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(dolarPrice, qntDinheiro));
    }
}
