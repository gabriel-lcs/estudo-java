import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHoras;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHoras = sc.nextDouble();
        sc.close();

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", horas * valorHoras);
    }
}
