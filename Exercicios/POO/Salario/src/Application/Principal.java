package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary= sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Which percetage to increase salary: ");
        double percetage = sc.nextDouble();
        funcionario.increaseSalary(percetage);

        System.out.println("New increased salary: $" + funcionario.grossSalary);
        sc.close();
    }
}
