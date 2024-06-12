import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite os graus celsius");
        number = in.nextInt();
        result = (number * 1.8) + 32;
        System.out.println("o resultado dos graus celsius em fahrenheit 100" + result ) ;

    }
}