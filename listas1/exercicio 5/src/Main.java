import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("dgite a quilometragem: ");
        number = in.nextInt();
        result = number/3.6;
        System.out.println(" a quilometragem em m/s é igual à " + result);

    }
}