package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = scanner.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.printf("%nFatura: %n");
        System.out.printf("Pagamento basico: %.2f%n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());

        scanner.close();

    }
}
