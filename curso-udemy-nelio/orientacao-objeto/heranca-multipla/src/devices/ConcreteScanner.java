package devices;

public class ConcreteScanner extends Device implements Scanner{

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.printf("Scanner processing: %s%n", doc);
    }

    @Override
    public String scan(){
        return "Scanned content";
    }
}
