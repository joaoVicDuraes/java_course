import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int z;
        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            z = sc.nextInt();
            if (z >= 10 && z <= 20) {
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.println("In: " + in);
        System.out.println("Out: "+ out);

        sc.close();
    }
}
