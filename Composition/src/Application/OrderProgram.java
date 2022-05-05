package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

public class OrderProgram {

  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter Client Data: ");
    System.out.print("Name: ");
    String clientName = sc.nextLine();
    System.out.print("Email: ");
    String clientEmail = sc.nextLine();
    System.out.print("Birth Date: ");
    Date clientBirthDate = sdf.parse(sc.next());
    Client client = new Client(clientName, clientEmail, clientBirthDate);

    System.out.println("Enter Order Data: ");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(new Date(), status, client);

    System.out.println("How many items to this order ? ");
    int amountTo = sc.nextInt();

    for (int index = 1; index <= amountTo; index++) {
      System.out.println("Enter #" + index + " item data: ");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();

      Product product = new Product(productName, productPrice);

      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      OrderItem orderItem = new OrderItem(quantity, productPrice, product);
      order.addItem(orderItem);
    }

    System.out.println();
    System.out.println("Order Summary: ");
    System.out.println(order);

    sc.close();
  }

}
