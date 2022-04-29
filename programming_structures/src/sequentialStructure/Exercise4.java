package sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your number ?");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("How much is your salary hourly ?");
        int salaryHourly = sc.nextInt();
        sc.nextLine();

        System.out.println("How many hours did you work ?");
        double hours = sc.nextDouble();
        sc.nextLine();

        double salary = salaryHourly * hours;

        System.out.println("Number: " + number);
        System.out.println("Salary: U$ " + String.format("%.2f", salary));

        sc.close();


    }

}
