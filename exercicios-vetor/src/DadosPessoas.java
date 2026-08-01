// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < altura.length; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = scanner.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            scanner.nextLine();
            genero[i] = scanner.next().charAt(0);
        }

        double maior = altura[0], menor = altura[0], somaAlturaMulheres = 0.0;
        int qntMulheres = 0, qntHomens = 0;

        for (int i = 0; i < altura.length; i++){
            if (altura[i] > maior){
               maior = altura[i];
            }

            if (altura[i] < menor){
                menor = altura[i];
            }

            if (genero[i] == 'M'){
                qntHomens ++;
            }
            else {
                somaAlturaMulheres += altura[i];
                qntMulheres ++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", somaAlturaMulheres / qntMulheres);
        System.out.printf("Numero de homens = %d%n", qntHomens);

        scanner.close();
    }
}
