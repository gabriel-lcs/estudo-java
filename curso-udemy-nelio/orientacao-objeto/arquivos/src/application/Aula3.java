package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula3 {
    static void main() {
        String path = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/arquivos/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.printf("Error: %s%n", e.getMessage());
        }

    }
}
