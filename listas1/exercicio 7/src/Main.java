import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite quantos milimetros precisa tranformar em polegadas: ");
        number = in.nextInt();
        result = number/25.4;
        System.out.println("o resultado dos milimetros em polegadas será igual à " + result);

    }
}