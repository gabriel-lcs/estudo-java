// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        int pos = 0;
        double maior = vect[0];

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior){
                maior = vect[i];
                pos = i;
            }
        }

        System.out.printf("%nMAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", pos);
        scanner.close();
    }
}
