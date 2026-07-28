import java.util.Locale;
import java.util.Scanner;

public class Questao7 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x, y;

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y <0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else {
            System.out.println("Origem");
        }
    }
}
