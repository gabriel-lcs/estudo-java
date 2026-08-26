package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: %n", i + 1);

            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpense = scanner.nextDouble();

                list.add(new PessoaFisica(name, anualIncome, healthExpense));
            }
            else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberEmp = scanner.nextInt();

                list.add(new PessoaJuridica(name, anualIncome, numberEmp));
            }

        }

        scanner.close();

        double total = 0.0;

        System.out.printf("%nTAXES PAID:%n");
        for (Contribuinte pessoa : list){
            System.out.println(pessoa);
            total += pessoa.imposto();
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f%n", total);
    }
}
