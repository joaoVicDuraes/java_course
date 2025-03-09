import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            if (a%b == 0) {
                System.out.println("Sao multiplos");
            }else{
                System.out.println("Nao sao multiplos");
            }
        }
        if(b > a){
            if (b%a == 0) {
                System.out.println("Sao multiplos");
            }else{
                System.out.println("Nao sao multiplos");
            }
        }

        sc.close();
    }
}
