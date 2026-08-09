// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.

import java.util.Scanner;

public class MaisVelho {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        String[] vectName = new String[n];
        int[] vectIdade = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:%n", i + 1);

            System.out.print("Nome: ");
            scanner.nextLine();
            vectName[i] = scanner.nextLine();

            System.out.print("Idade: ");
            vectIdade[i] = scanner.nextInt();
        }

        int velho = vectIdade[0], posicaoVelho = 0;

        for (int i = 0; i < n; i++){
            if(vectIdade[i] > velho){
                velho = vectIdade[i];
                posicaoVelho = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", vectName[posicaoVelho]);
        scanner.close();
    }
}
