package sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bar code: ");
        int firstBarCode = sc.nextInt();

        System.out.println("Enter the amount: ");
        int firtAmount = sc.nextInt();

        System.out.println("Enter the price: ");
        double firstPrice = sc.nextDouble();

        System.out.println("Enter the bar code: ");
        int secondBarCode = sc.nextInt();

        System.out.println("Enter the amount: ");
        int secondAmount = sc.nextInt();

        System.out.println("Enter the price: ");
        double secondPrice = sc.nextDouble();

        double total = firtAmount * firstPrice + secondAmount * secondPrice;
        System.out.println("Amount to pay: $ " + String.format("%.2f", total));

        sc.close();
    }

}
