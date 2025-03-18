package application;

import java.util.Locale;
import java.util.Scanner;

import entityes.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Pessoas deseja digitar: ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for(int i=0; i<vect.length; i++){
            sc.nextLine();

            int idadeAux = i+1;
            System.out.println("Dados da " + idadeAux + "º pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        for(int i=0; i<vect.length; i++){
            soma += vect[i].getAltura();
        }

        double mediaAltura = soma/n;
        int contador = 0;

        for(int i=0; i<vect.length; i++){
            if (vect[i].getIdade() <16) {
                contador += 1;
            }
        }

        double porcentagem = (contador * 100)/n;

        System.out.println("Altura Média: " + mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%% \n" , porcentagem );

        for(int i=0; i<vect.length; i++){
            if (vect[i].getIdade() <16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
