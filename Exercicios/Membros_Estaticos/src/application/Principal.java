package application;

import java.util.Locale;
import java.util.Scanner;

import entityes.Dolar;

public class Principal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o preço do dolar? ");
        double preco = sc.nextDouble();
        System.out.print("Qual valor voce deseja converter: ");
        double valor = sc.nextDouble();

        double valor_convertido = Dolar.convertido(preco, valor);

        System.out.print("Valor convertido: " + valor_convertido);

        sc.close();

    }
}
