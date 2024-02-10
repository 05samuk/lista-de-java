import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("dgite um numero: ");
        number = in.nextInt();
        result = number/5;
        System.out.println("a quinta parte do numero é " + result);


    }
}