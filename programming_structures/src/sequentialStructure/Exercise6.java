package sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapeze, square, rectangle;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = A * C / 2.0;
        circle = 3.14159 * C * C;
        trapeze = (A + B) / 2.0 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("Triangle: %.3f%n", triangle);
        System.out.printf("Circle: %.3f%n", circle);
        System.out.printf("Trapeze: %.3f%n", trapeze);
        System.out.printf("Square: %.3f%n", square);
        System.out.printf("Rectangle: %.3f%n", rectangle);

    }
}
