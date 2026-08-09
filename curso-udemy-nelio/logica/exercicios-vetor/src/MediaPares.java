// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        int numPares = 0, somaPares = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0 ){
                somaPares += vect[i];
                numPares ++;
            }
        }

        if (numPares > 0){
            System.out.printf("MEDIA DOS PARES = %.1f%n", (double) somaPares / numPares);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        scanner.close();
    }
}
