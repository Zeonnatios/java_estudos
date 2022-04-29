package programs;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        sc.nextLine();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        student.printResult(student.finalGrade());

        sc.close();
    }
}
