import java.util.Scanner;

public class test {
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
                    System.out.println(mat.length - 1);
                    System.out.println(mat[i].length - 1);
                    }
                }
            }
        }


