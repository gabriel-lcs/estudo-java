import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo, quantidade;
        double total = 0.0;

        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();
        scanner.close();

        if (codigo == 1){
            total = quantidade * 4;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5;
        }
        else if (codigo == 4){
            total = quantidade * 2;
        }
        else if (codigo == 5) {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);
    }
}
