package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.Employee;
import model.OutsourcedEmployee;

public class EmployeeApp {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employeeList = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int amountToEmployee = sc.nextInt();

    for (int index = 1; index <= amountToEmployee; index += 1) {

      System.out.println("Employee #" + index + " data:");
      System.out.print("Is Outsourced (y/n) ?");
      char isOutsourced = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Hours: ");
      int hours = sc.nextInt();

      System.out.print("Value por hour: ");
      double valuePerHour = sc.nextDouble();

      if (isOutsourced == 'y' || isOutsourced == 'Y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employeeList.add(new Employee(name, hours, valuePerHour));
      }

    }

    System.out.println();
    System.out.println("PAYMENTS:");

    for (Employee employee : employeeList) {
      System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
    }
    sc.close();

  }

}
