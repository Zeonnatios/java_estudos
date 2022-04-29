package sequentialStructure;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int firstValue = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the second value: ");
        int secondValue = sc.nextInt();
        sc.nextLine();

        int total = firstValue + secondValue;

        System.out.println("Out: " + total);
        sc.close();
    }


}
