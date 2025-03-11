package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Enter rectangle whidth and height");
        System.out.print("Whidth: ");
        retangulo.whidth = sc.nextDouble();
        System.out.print("Height: ");
        retangulo.height = sc.nextDouble();

        System.out.println("Area: " + retangulo.area() + "\nPerimeter: " + retangulo.perimeter() + "\nDiagonal: " + retangulo.diagonal());

        sc.close();
    }
}
