package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data: %n", i + 1);

            System.out.print("Common, used or importes (c/u/i)? ");
            char type = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (type == 'c'){
                list.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = scanner.next();

                list.add(new UsedProduct(name, price, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            }
            else if (type == 'i') {
                System.out.print("Customs fee: ");
                double custom = scanner.nextDouble();

                list.add(new ImportedProduct(name, price, custom));
            }
        }

        scanner.close();

        System.out.printf("%nPRICE TAGS: %n");
        for (Product product : list){
            System.out.println(product.priceTag());
        }
    }
}
