// Fazer um programa para ler um número N e uma matriz de ordem N contando números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        int negativos = 0;

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    System.out.printf("%d ", mat[i][j]);
                }

                if (mat[i][j] < 0){
                    negativos ++;
                }
            }
        }

        System.out.printf("%nNegative numbers = %s%n", negativos);
        scanner.close();
    }
}
