package application;

import java.io.File;
import java.util.Scanner;

public class InfoArquivo {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.printf("getName %s%n", path.getName());
        System.out.printf("getParent %s%n", path.getParent());
        System.out.printf("getPath %s%n", path.getPath());

        scanner.close();
    }
}
