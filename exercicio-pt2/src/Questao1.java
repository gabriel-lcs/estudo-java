import java.util.Scanner;

public class Questao1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num;

        num = scanner.nextInt();
        scanner.close();

        if (num < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }
    }
}