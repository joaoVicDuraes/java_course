import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double area = r * r * 3.14;
        System.out.println(area);
        sc.close();
    }
}
