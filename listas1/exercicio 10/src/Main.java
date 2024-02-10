import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite quantas milhas voce precisa tranformar");
        number = in.nextInt();
        result = number * 1.609;
        System.out.println("o resultado das milhas para quilometros será igual à"+ result ) ;


    }
}