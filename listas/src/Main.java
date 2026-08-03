import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for(String name : list){
            System.out.println(name);
        }

        System.out.println("-----------------");

        list.remove("Anna");
        list.remove(1);
        list.removeIf(name -> name.charAt(0) == 'M');

        for(String name : list){
            System.out.println(name);
        }

        list.add("Maria");
        list.add("Alex");
        list.add("Anna");

        System.out.println("-----------------");
        for(String name : list){
            System.out.println(name);
        }

        System.out.printf("Index Of Bob: %d%n", list.indexOf("Bob"));
        System.out.printf("Index Of Marco: %d%n", list.indexOf("Marco"));

        List<String> listaFiltrada = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("-----------------");

        for(String name : listaFiltrada){
            System.out.println(name);
        }

        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.printf(name);
    }
}
