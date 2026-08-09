import java.util.Scanner;

public class Questao2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n, in = 0, out = 0, num;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            num = scanner.nextInt();

            if (num >= 10 && num <= 20){
                in += 1;
            }
            else {
                out += 1;
            }
        }

        scanner.close();
        System.out.printf("%d in%n%d out%n", in, out);
    }
}
