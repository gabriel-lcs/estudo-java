package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        String pathReader = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/exercicio-arquivos/products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(pathReader))) {
            String line = br.readLine();

            while (line != null){
                String[] vect = line.split(",");

                Integer qnt = Integer.parseInt(vect[2]);
                Double price = Double.parseDouble(vect[1]);
                String name = vect[0];

                products.add(new Product(qnt, price, name));

                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        boolean success = new File("/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/exercicio-arquivos/out").mkdir();

        String pathWrite = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/exercicio-arquivos/out/summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite))){
            for (Product product : products){
                bw.write(product.toString());
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
