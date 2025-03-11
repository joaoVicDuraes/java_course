import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 2002){
            System.out.println("Acesso negado! ");
            n = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");

        sc.close();

    }
}
