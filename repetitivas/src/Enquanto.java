import java.util.Scanner;

public class Enquanto {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num, soma;

        num = scanner.nextInt();
        soma = num;

        while (num != 0){
            num = scanner.nextInt();
            soma += num;
        }

        scanner.close();
        System.out.println(soma);
    }
}
