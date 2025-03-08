
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int uni1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int uni2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double valor_total = (uni1 * val1) + (uni2 * val2);
        System.out.println("Valor a Pagar = R$" + valor_total + "codigos dos produtos: " + cod1 + cod2 );

        sc.close();
    }
}
