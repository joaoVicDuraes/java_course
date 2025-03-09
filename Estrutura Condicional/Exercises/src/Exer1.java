import java.util.Scanner;

public class Exer1{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0){
            System.out.println("Nao negativo");
        }else{
            System.out.println("Negativo");
        }
        sc.close();
    }
}
