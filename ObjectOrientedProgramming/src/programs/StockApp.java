package programs;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class StockApp {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product;
        product = new Product();

        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price of product: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println(product);
        System.out.println();

        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToBeAdded = sc.nextInt();
        product.addProducts(quantityToBeAdded);

        System.out.println();
        System.out.println(product);
        System.out.println();


        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToBeRemoved = sc.nextInt();
        product.removeProducts(quantityToBeRemoved);


        System.out.println();
        System.out.println(product);
        System.out.println();


    }

}
