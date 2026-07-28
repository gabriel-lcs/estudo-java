package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

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
