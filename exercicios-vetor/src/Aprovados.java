// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();

        String[] vectName = new String[n];
        double[] vectN1 = new double[n];
        double[] vectN2 = new double[n];

        for (int i = 0; i < vectName.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
            scanner.nextLine();
            vectName[i] = scanner.nextLine();
            vectN1[i] = scanner.nextDouble();
            vectN2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < vectName.length; i++) {
            double media = (vectN1[i] + vectN2[i]) / 2.0;

            if(media >= 6){
                System.out.println(vectName[i]);
            }
        }

        scanner.close();
    }
}
