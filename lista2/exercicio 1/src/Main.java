import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double N1;
        System.out.println("digite um valor:");
        N1 = in.nextDouble();

        if (N1<0)
            System.out.println("Valor inválido!");
        else {
            double resultado = Math.sqrt(N1);

            System.out.println("a raiz quadrada será igual à: " + resultado);
        }

    }
}