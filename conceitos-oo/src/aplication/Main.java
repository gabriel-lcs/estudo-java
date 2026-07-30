package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        product.setName("computer");
        System.out.printf("Updated: %s%n", product.getName());
        product.setPrice(1200);
        System.out.printf("Updated: %s%n", product.getPrice());

        System.out.printf("%nProduct data: %s%n", product);

        System.out.printf("%nEnter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.printf("%nUpdated data: %s%n", product);

        System.out.printf("%nEnter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.printf("%nUpdated data: %s%n", product);

        scanner.close();
    }
}
