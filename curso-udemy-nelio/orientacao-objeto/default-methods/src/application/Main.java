package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService service = new BrazilInterestService(2.0);

        double payment = service.payment(amount, months);

        System.out.printf("Payment after %s months: %n", months);
        System.out.printf("%.2f%n", payment);

        scanner.close();
    }
}
