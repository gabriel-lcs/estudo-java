package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.name = scanner.nextLine();
        student.nota1 = scanner.nextDouble();
        student.nota2 = scanner.nextDouble();
        student.nota3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.media());
        System.out.println(student);
    }
}
