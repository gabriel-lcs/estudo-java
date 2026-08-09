import java.util.Scanner;

public class Questao5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fat = 0;

        if (n == 0 || n == 1){
            fat = 1;
        }
        else {
            for (int i = n - 1; i >0 ; i--){
                n *= i;
            }

            fat = n;
        }

        scanner.close();
        System.out.println(fat);
    }
}
