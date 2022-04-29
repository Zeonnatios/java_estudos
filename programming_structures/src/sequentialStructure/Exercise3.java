package sequentialStructure;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int valueA = sc.nextInt();

        System.out.println("Enter second value: ");
        int valueB = sc.nextInt();

        System.out.println("Enter third value: ");
        int valueC = sc.nextInt();

        System.out.println("Enter fourth value: ");
        int valueD = sc.nextInt();

        int result = valueA * valueB - valueC * valueD;

        System.out.println("Difference: " + result);
        sc.close();


    }
}
