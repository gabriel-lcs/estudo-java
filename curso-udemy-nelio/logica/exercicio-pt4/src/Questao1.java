import java.util.Scanner;

public class Questao1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if ((i % 2) != 0){
                System.out.println(i);
            }
        }
    }
}
