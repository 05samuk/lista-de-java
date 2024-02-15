import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero real");
        double base, altura, result;
        base = in.nextDouble();
        altura = in.nextDouble();
        result = ((altura*base)/2);
        System.out.println("o resultado sera igual a:" + result );

    }
}