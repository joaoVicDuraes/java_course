package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter project data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product.toString());
        System.out.println("Enter the number of products to be added in stock: ");
        int quantityadded = sc.nextInt();
        product.addProducts(quantityadded);
        System.out.println("Updated data: " + product.toString());
        
        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityrRemoved = sc.nextInt();
        product.removeProducts(quantityrRemoved);
        System.out.println("Updated data: " + product.toString());
        

        sc.close();
    }
}
