package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob1 {
    static void main() {

        List<String> list = new ArrayList<>();

        String path = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/interface-comparable/in1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();

            while (name != null){
                list.add(name);

                name = br.readLine();
            }

            Collections.sort(list);

            for (String s :list){
                System.out.println(s);
            }
        }
        catch (IOException e){
            System.out.printf("Error : %s%n", e.getMessage());
        }
    }
}
