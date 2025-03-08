import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double nhr = sc.nextDouble();
        double salaryHour = sc.nextDouble();
        double salary = salaryHour * nhr;
        
        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = " + salary);

        sc.close();
    }
}
