package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {
    static void main() {

        String path = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/arquivos/in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.printf("Error: %s%n", e.getMessage());
        }
        finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
