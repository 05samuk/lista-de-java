import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor em dinheiro: ");
        double n1;
        n1 = in.nextDouble();
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");
        System.out.println("escolha uma opção.");
        int escolha = in.nextInt();
        double troco;


         switch (escolha){
             case 1:
                 System.out.println("Bebida selecionada: Café Expresso");
                 if (n1 > 0.50) {
                     troco = n1 - 0.50;
                     System.out.println("seu troco: " + troco);
                 }
                 else {
                     System.out.println("valor insuficiente!");
                 } break;
             case 2:
                 System.out.println("Bebida selecionada: Café Longo");
                 if (n1 > 1){
                     troco = n1 - 1;
                     System.out.println("seu troco: " + troco);
                 }
                 else {
                     System.out.println("valor insuficiente!");
                 } break;
             case 3:
                 System.out.println("Bebida selecionada: Capuccino");
                 if (n1 > 2.50){
                     troco = n1 - 2.50;
                     System.out.println("seu troco: " + troco);
                 }
                 else {
                     System.out.println("bebida insuficiente");
                 } break;

             case 4:
                 System.out.println("Bebida selecionada: Chocolate");
                 if (n1>2){
                     troco = n1 - 2;
                     System.out.println("seu troco: " + troco);
                 }
                 else {
                     System.out.println("valor insuficiente!");
                 } break;
         }
    }
}