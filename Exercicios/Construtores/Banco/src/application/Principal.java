package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit(y/n)? ");
        String deposit = sc.nextLine();

        Cliente cliente;
        
        if (deposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            cliente = new Cliente(number, name, initialDeposit);
            
        } else {
            cliente = new Cliente(number, name);

        }

        System.out.println("Account data:\n" + cliente);

        System.out.println("Enter a deposit value: ");
        double value = sc.nextDouble();
        cliente.deposit(value);
        System.out.println("Update account data:\n" + cliente);

        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        cliente.withdraw(value);
        System.out.println("Update account data:\n" + cliente);
        sc.close();
    }
}
