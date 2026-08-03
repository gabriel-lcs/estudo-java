package aplication;

// A dona de um empreendimento possui dez quartos para alugar para estudantes sendo esses quartos identificados pelos números 0 a 9.

// Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudando, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.

import entities.Aluguel;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        Aluguel[] vect = new Aluguel[10];

        for (int i  = 0; i < n; i++){
            System.out.printf("%nRent #%d%n", i + 1);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            vect[room] = new Aluguel(name, email);
        }

        System.out.printf("%nBusy rooms: %n");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.printf("%d: %s%n", i, vect[i]);
            }
        }

        scanner.close();
    }
}
