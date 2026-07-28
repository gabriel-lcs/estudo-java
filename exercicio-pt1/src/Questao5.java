import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, quantidade;
        double  valor, total;

        id = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextDouble();

        total = quantidade * valor;

        id = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextDouble();
        sc.close();

        total += quantidade * valor;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
