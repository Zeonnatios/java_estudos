package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> employeeList = new ArrayList<Employee>();

    System.out.println("How many employees will be registered? ");
    int amountOfEmployees = sc.nextInt();

    for (int index = 1; index <= amountOfEmployees; index += 1) {
      System.out.println();
      System.out.println("Employee #" + index + ": ");

      System.out.print("Id: ");
      int id = sc.nextInt();
      while (hasId(employeeList, id)) {
        System.out.print("Id already taken. Try again: ");
        id = sc.nextInt();
      }

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
      employeeList.add(new Employee(id, name, salary));
    }

    // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

    System.out.println();
    System.out.print("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();
    Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    if (emp == null) {
      System.out.println("This id does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = sc.nextDouble();
      emp.increaseSalary(percentage);
    }

    // PART 3 - LISTING EMPLOYEES:

    System.out.println();
    System.out.println("List of employees:");
    for (Employee obj : employeeList) {
      System.out.println(obj);
    }

    sc.close();
  }

  public static boolean hasId(List<Employee> list, int id) {
    Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return emp != null;
  }


}

