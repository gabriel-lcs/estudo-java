package aplication;

/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
*/

import entites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("%nEmplyoee #%d:%n", i + 1);

            System.out.print("Id: ");
            int id = scanner.nextInt();

            while (hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.printf("%nEnter the employee id that will have salary increase : ");
        int idEscolhido = scanner.nextInt();

        Integer posicao = null;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idEscolhido){
                posicao = i;
            }
        }

        // Employee escolhido = list.stream().filter(x -> x.getId() == idEscolhido).findFirst().orElse(null);

        if (posicao == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();

            list.get(posicao).increaseSalary(percentage);
        }

        System.out.printf("%nList of emplyoees: %n");
        for (Employee employees : list) {
            System.out.printf("%d, %s, %.2f%n", employees.getId(), employees.getName(), employees.getSalary());
        }

        scanner.close();
    }

    public static boolean hasId(List<Employee> list, int id){
        for(Employee funcionario : list){
            if(funcionario.getId() == id){
                return true;
            }
        }

        return false;
    }
}
