import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite o numero: ");
        number = in.nextInt();
        result = number/3.6;
        System.out.println(" a velocida em m/s para km/h será: " + result);

    }
}