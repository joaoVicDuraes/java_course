import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double area_triangulo = a * c / 2;
        double area_circulo = c * c * 3.14;
        double area_trapezio = (a+b) * c/2;
        double area_quadrado = b*b;
        double area_retangulo = a*b;

        System.out.println("Triangulo: " + area_triangulo);
        System.out.println("Circulo: " + area_circulo);
        System.out.println("Trapezio: " + area_trapezio);
        System.out.println("Quadrado: " + area_quadrado);
        System.out.println("Retangulo: " + area_retangulo);
        sc.close();
    }
}
