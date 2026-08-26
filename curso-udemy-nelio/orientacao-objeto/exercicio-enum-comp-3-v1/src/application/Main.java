package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String bDate = scanner.nextLine();

        Client client = new Client(name, email, LocalDate.parse(bDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = scanner.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int qnt = scanner.nextInt();

        for (int i = 0; i < qnt; i++) {
            System.out.print("Product name: ");
            scanner.nextLine();
            String nameProduct = scanner.nextLine();
            System.out.print("Product price: ");
            double priceProduct = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(priceProduct, nameProduct);
            OrderItem item = new OrderItem(quantity, priceProduct, product);
            order.addItem(item);

        }

        scanner.close();

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.printf("Order moment: %s%n", order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.printf("Order status: %s%n", OrderStatus.PROCESSING);
        System.out.printf("Client: %s %n", client);
        System.out.println("Order items: ");
        System.out.print(order);
        System.out.printf("Total price: $%.2f%n", order.total());

    }
}
