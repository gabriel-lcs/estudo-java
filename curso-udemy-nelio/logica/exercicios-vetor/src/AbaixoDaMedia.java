// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double media = sum / vect.length;

        System.out.printf("%nMEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
