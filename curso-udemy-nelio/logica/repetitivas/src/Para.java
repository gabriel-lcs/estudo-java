import java.util.Scanner;

public class Para {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < x; i++){
            int num = scanner.nextInt();
            soma += num;
        }

        scanner.close();
        System.out.println(soma);
    }
}
