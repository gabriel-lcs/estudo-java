import java.util.Scanner;

public class Questao1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num = 0, pass = 2002;

        num = scanner.nextInt();

        while (num != pass){
            System.out.println("Senha Invalida");
            num = scanner.nextInt();
        }

        scanner.close();
        System.out.println("Acesso Permitido");
    }
}
