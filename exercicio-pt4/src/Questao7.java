import java.util.Scanner;

public class Questao7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }
    }
}
