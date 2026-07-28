import java.util.Scanner;

public class Questao3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0, gasolina = 0, disel = 0, combustivel;

        combustivel = scanner.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                disel += 1;
            }

            combustivel = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%nGasolina: %d%nDisel: %d%n", alcool, gasolina, disel);
    }
}
