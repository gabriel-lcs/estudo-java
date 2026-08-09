// Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int num = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == num) {
                    System.out.printf("Position %d,%d: %n", i, j);

                    if (i > 0 ) {
                        System.out.printf("Up: %d%n", mat[i - 1][j]);
                    }

                    if (j > 0){
                        System.out.printf("Left: %d%n", mat[i][j - 1]);
                    }

                    if (i < mat.length - 1) {
                        System.out.printf("Down: %d%n", mat[i + 1][j]);
                    }

                    if (j < mat[i].length - 1) {
                        System.out.printf("Right: %d%n", mat[i][j + 1]);
                    }
                }
            }
        }
    }
}
