import java.util.Scanner;

public class Questao2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num;

        num = scanner.nextInt();
        scanner.close();

        if(num % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
    }
}
