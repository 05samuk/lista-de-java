import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2,  result;
        Scanner in = new Scanner(System.in);
        System.out.println("dgite os numeros: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        result = (number1+number2)/2;
        System.out.println("a média dos numeros é igual à " + result);

    }
}