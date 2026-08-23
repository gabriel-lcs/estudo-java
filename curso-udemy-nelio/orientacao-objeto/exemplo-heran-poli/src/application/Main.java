package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data: %n", i + 1);

            System.out.print("Outsourced (y/n)? ");
            char outsourced = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valueHours = scanner.nextDouble();

            Employee employee;

            if (outsourced == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = scanner.nextDouble();

                employee = new OutsourcedEmployee(name, hours, valueHours, addCharge);
            }
            else {
                employee = new Employee(name, hours, valueHours);
            }

            employees.add(employee);

        }

        scanner.close();

        System.out.printf("%nPAYMENTS: %n");
        for (Employee emp : employees){
            System.out.printf("%s - $ %.2f%n", emp.getName(), emp.payment());
        }
    }
}
