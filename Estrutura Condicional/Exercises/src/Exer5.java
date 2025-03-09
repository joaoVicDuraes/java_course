import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cachorro_quente = 4.0;
        double x_salada = 4.5;
        double x_bacon = 5.0;
        double torrada = 2.0;
        double refri = 1.5; 

        int pedido = sc.nextInt();
        int quant = sc.nextInt();
        double valor = 0;

        if (pedido == 1){
           valor = cachorro_quente * quant; 
        }
        if (pedido == 2){
            valor = x_salada * quant; 
         }
        if (pedido == 3){
            valor = x_bacon * quant; 
         }
        if (pedido == 4){
            valor = torrada * quant; 
         }
        if (pedido == 5){
            valor = refri * quant; 
         }

        System.out.println("Total: R$" + valor);
        sc.close();
    }
}
