import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char c;

        x = sc.next();
        System.out.println(x);

        y = sc.nextInt();
        System.out.println(y);

        z = sc.nextDouble();
        System.out.println(z);

        c = sc.next().charAt(0);
        System.out.println(c);

        sc.close();
    }
}