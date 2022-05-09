package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.ImportedProduct;
import model.Product;
import model.UsedProduct;

public class ProductApp {

  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int numberOfProducts = sc.nextInt();

    for (int index = 1; index <= numberOfProducts; index += 1) {
      System.out.println("Product #" + index);
      System.out.print("Common, used or imported (c / u / i) ? ");
      char productType = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Price: ");
      double price = sc.nextDouble();

      if (productType == 'c') {
        productList.add(new Product(name, price));
      } else if (productType == 'i') {
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();
        productList.add(new ImportedProduct(name, price, customsFee));
      } else {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufactureDate = sdf.parse(sc.next());
        productList.add(new UsedProduct(name, price, manufactureDate));
      }
    }

    System.out.println();
    System.out.println("PRICE TAGS");
    for (Product product : productList) {
      System.out.println(product.priceTag());
    }

    sc.close();

  }

}
