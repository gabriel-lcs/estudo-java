import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com 3 números:");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int maior = max(n1, n2, n3);

        resultado(maior);

        scanner.close();
    }

    public static int max(int x, int y, int z){
        int aux;

        if (x > y && x > z){
            aux = x;
        }
        else if (y > x && y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void resultado(int value){
        System.out.printf("Maior: %d", value);
    }
}
