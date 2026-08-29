package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula1 {
    static void main() {

        File file = new File("/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/arquivos/in.txt");

        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (IOException e){
            System.out.printf("Error: %s%n", e.getMessage());
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
        }

    }
}
