// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares

import java.util.Scanner;

public class NumerosPares {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        int qntPares = 0;

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                qntPares ++;
            }
        }
        System.out.println();

        System.out.printf("%nQUANTIDADE DE PARES = %d", qntPares);
        scanner.close();
    }
}
