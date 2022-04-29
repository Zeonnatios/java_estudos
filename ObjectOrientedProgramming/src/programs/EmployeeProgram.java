package programs;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.name = sc.nextLine();

        System.out.println("Gross Salary:");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println(employee);

        sc.close();

    }

}
