package programs;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter your name: ");
        String holder = sc.nextLine();

        System.out.println("Enter your account number: ");
        int number = sc.nextInt();

        System.out.println("Is there an initial deposit ? (Y/N) ");
        sc.nextLine();
        char response = sc.next().charAt(0);

        if (response == 'Y') {
            System.out.println("Enter initial deposit value:");
            double initialDeposite = sc.nextDouble();
            account = new Account(holder, number, initialDeposite);
        } else {
            account = new Account(holder, number);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated Account Data:");
        System.out.println(account);

        sc.close();

    }

}
