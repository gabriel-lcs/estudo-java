import java.util.Scanner;

public class Questao4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int inicial, fim;

        inicial = scanner.nextInt();
        fim = scanner.nextInt();
        scanner.close();

        if (fim > inicial){
            System.out.printf("O JOGO DUROU %d HORA(S)%n", fim - inicial);
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", 24 - inicial + fim);
        }
    }
}
