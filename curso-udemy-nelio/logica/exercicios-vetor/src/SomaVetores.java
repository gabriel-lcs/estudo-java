// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero)

import java.util.Scanner;

public class SomaVetores {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < vectB.length; i++) {
            System.out.println(vectA[i] + vectB[i]);
        }
    }
}
