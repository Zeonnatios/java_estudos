package sequentialStructure;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        double result = 3.14159 * value * value;
        System.out.println("Out: " + String.format("%.4f%n", result));
        sc.close();
    }

}
