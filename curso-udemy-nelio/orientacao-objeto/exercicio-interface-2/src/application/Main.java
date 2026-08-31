package application;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Numero: ");
        int num = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        scanner.nextLine();
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Valor do contrato: ");
        double valeuContrato = scanner.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = scanner.nextInt();

        Contract contract = new Contract(num, date, valeuContrato);

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, parcelas);

        System.out.println("Parcelas:");
        System.out.println(contract);

        scanner.close();
    }
}
