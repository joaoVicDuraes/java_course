import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0;
        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }
        for(int i=0; i<n; i++){
            soma += vect[i];
        }

        soma = soma/n;
        System.out.printf("%.2f%n", soma);

        sc.close();
    }
}
