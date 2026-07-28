import java.util.Scanner;

public class Questao3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a > b){
            if(a % b == 0){
                System.out.println("SAO MULTIPLOS");
            }
            else{
                System.out.println("NAO SAO MULTIPLOS");
            }
        }
        else {
            if(b % a == 0){
                System.out.println("SAO MULTIPLOS");
            }
            else{
                System.out.println("NAO SAO MULTIPLOS");
            }
        }

    }
}
