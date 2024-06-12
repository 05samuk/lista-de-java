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

        if (result >= 8.5)
            System.out.println("A");

        if (result >= 7 && result <= 8.5)
            System.out.println("B");

        if (result >= 5 && result <=7)
            System.out.println("C");

        if (result <= 5)
            System.out.println("D");


    }
}