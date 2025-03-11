import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;

        while(n1 != 4){
            if (n1 == 1) {
                alcool += 1;   
            }
            if (n1 == 2) {
                gasolina += 1;
            }
            if (n1 == 3) {
                diesel += 1;
            }

            n1 = sc.nextInt();
        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();

    }
}