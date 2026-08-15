// Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme o exemplo.

package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data: %n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String data1 = scanner.next();
            LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.printf("%nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name : %s%n", worker.getName());
        System.out.printf("Department : %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", monthAndYear, worker.income(year, month));

        scanner.close();

    }
}
