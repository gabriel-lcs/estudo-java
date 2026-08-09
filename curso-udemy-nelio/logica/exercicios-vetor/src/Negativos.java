// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Negativos {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
