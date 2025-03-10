import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for(int i = 0; i <= n1; i++){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
