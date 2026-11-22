package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Main {
    static void main() {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.printf("Scan result: %s%n", s.scan());

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.printf("Scan result: %s", c.scan());
    }
}
