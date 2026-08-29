package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    static void main() {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/arquivos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
