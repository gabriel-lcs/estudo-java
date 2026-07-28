package aplication;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area triângulo X: %.4f%n", areaX);
        System.out.printf("Area triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area: X");
        }
        else {
            System.out.println("Maior area: Y");
        }
    }
}
