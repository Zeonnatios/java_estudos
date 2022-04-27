package programs;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price of product: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

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
