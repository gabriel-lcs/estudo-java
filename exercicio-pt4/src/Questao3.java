import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, media;

        int x = scanner.nextInt();

        for (int i = 0; i < x; i++){
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.printf("%.1f%n", media);
        }

        scanner.close();
    }
}
