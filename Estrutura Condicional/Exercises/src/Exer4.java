import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrInicial = sc.nextInt();
        int hrFinal = sc.nextInt();

        int duracao;
        if (hrInicial < hrFinal) {
            duracao = hrFinal - hrInicial;
        }else{
            duracao = 24 - hrInicial + hrFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();
    }
}
