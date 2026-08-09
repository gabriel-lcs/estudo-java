import java.util.Scanner;

public class Questao4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n, n1, n2;
        double div;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            if (n2 == 0){
                System.out.println("divisao impossivel");
            }
            else {
                div = (double) n1 / n2;
                System.out.println(div);
            }
        }

        scanner.close();
    }
}
