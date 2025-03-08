import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1  = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
