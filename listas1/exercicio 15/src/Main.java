import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite os dados para calcular o volume do cilindro ");
        double raio, altura, Pi, result;
        Pi = Math.PI;
        raio = in.nextInt();
        altura = in.nextInt();
        result = (Pi*(raio*raio))*altura;
        System.out.println("o resultado do colume do cilindro sera igual a:");

    }
}