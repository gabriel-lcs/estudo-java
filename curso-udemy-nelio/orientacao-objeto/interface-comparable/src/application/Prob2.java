package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob2 {
    static void main() {

        List<Employee> list = new ArrayList<>();

        String path = "/home/gaweb/Programas/Java/estudo-java/curso-udemy-nelio/orientacao-objeto/interface-comparable/in2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String employee = br.readLine();

            while (employee != null){
                String[] fiels = employee.split(",");

                list.add(new Employee(fiels[0], Double.parseDouble(fiels[1])));

                employee = br.readLine();
            }

            Collections.sort(list);

            for (Employee s : list){
                System.out.println(s.getName() + "," + s.getSalary());
            }
        }
        catch (IOException e){
            System.out.printf("Error : %s%n", e.getMessage());
        }
    }
}
