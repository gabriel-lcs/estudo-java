import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static void main() {

        File file = new File("/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/excecoes/in.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.printf("Error opening file: %s%n", e.getMessage());
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
            System.out.println("Finally block executed");
        }

    }
}
