package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax= scanner.nextDouble();

        System.out.printf("%nEmployee: %s, $ %.2f%n", employee.name, employee.netSalary());

        System.out.printf("%nWhich percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("%nUpdated data: %s, $ %.2f%n", employee.name, employee.grossSalary);
    }
}
