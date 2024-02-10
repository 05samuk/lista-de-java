import java.util.*;

public class Main {
    public static void main(String[] args) {

        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        number = in.nextInt();
        result = 2*number;
        System.out.println("o dobro do numero digitado é: " + result);
    }
}