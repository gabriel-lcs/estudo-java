import java.util.Scanner;

public class Questao2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        while (x != 0 && y != 0 ){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y >0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }
}
