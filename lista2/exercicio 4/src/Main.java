import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2,  result;
        Scanner in = new Scanner(System.in);
        System.out.println("dgite os numeros: ");
        number1 = in.nextDouble();
        number2 = in.nextDouble();
        result = (number1+number2)/2;
        System.out.println("a média dos numeros é igual à " + result);

        if ( result >=50){
            System.out.println("Aprovado!");
        }
        else {

            System.out.println("informe a nota de recuperação: ");
            double NR = in.nextDouble();
            double MF = (result + NR) /2;
            if (MF < 50) {
                System.out.println("a média dessas notas é: " + MF);
                System.out.println("Reprovado!");

            }
            else {
                System.out.println("a média dessas notas é: " + MF);
                System.out.println("Aprovado!");

            }
        }
    }
}