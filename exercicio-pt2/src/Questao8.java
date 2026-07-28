import java.util.Locale;
import java.util.Scanner;

public class Questao8 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double valor, imposto = 0.0;
        
        valor = scanner.nextDouble();
        scanner.close();
        
        if (valor <= 2000){
            System.out.println("Isento");
        }
        else if (valor <= 3000) {
            imposto = (valor - 2000) * ((double) 8/100);

            System.out.printf("R$: %.2f%n", imposto);
        }
        else if (valor <= 4500) {
            imposto = ((valor - 3000) * ((double) 18/100) + (1000 * ((double) 8/100)));

            System.out.printf("R$: %.2f%n", imposto);
        }
        else if (valor > 4500) {
            imposto = (valor - 4500) * ((double) 28/100) + (1000 * ((double) 8/100)) + (1500 * ((double) 18/100));

            System.out.printf("R$: %.2f%n", imposto);
        }
    }
}
