// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, /bem como os nomes dessas pessoas caso houver.

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        String[] vectName = new String[n];
        int[] vectIdade = new int[n];
        double[] vectAltura = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:%n", i + 1);

            System.out.print("Nome: ");
            scanner.nextLine();
            vectName[i] = scanner.nextLine();

            System.out.print("Idade: ");
            vectIdade[i] = scanner.nextInt();

            System.out.print("Altura: ");
            vectAltura[i] = scanner.nextDouble();
        }

        double somaAltura = 0.0;
        int menores = 0;

        for (int i = 0; i < n; i++){
            somaAltura += vectAltura[i];

            if (vectIdade[i] < 16){
                menores ++;
            }
        }

        System.out.printf("%nAltura média: %.2f%n", somaAltura / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((double) menores / n) * 100);

        for (int i = 0; i < n; i++){
            if (vectIdade[i] < 16){
                System.out.println(vectName[i]);
            }
        }

        scanner.close();
    }
}
