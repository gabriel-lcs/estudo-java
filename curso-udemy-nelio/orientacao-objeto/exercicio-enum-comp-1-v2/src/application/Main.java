package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = scanner.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        String level = scanner.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%nEnter contract #%d data: %n", i + 1);

            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.next();
            LocalDate contractDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            double valueHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valueHour, duration);
            worker.addContract(contract);
        }

        System.out.printf("%nEnter month and year to calculate income  (/MM/YYYY): ");
        String findDate = scanner.next();

        int findDateMonth = Integer.parseInt(findDate.substring(0, 2));
        int findDateYear = Integer.parseInt(findDate.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", findDate, worker.income(findDateYear, findDateMonth));

        scanner.close();
    }
}
