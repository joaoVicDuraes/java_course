package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<vect.length; i++){
            vect[i] = sc.nextInt();
        }

        System.out.print("Valores: ");
        for(int i=0; i<vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        double sum = 0;

        for(int i=0; i<vect.length; i++){
            sum += vect[i];
        }

        System.out.println("\nSoma: " + sum);

        double avg = sum/n;

        System.out.println("Média: " + avg);




        sc.close();
    }
}
