import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("escolha um numero entre 5 e 9: ");
        int N1 = in.nextInt();

        if (N1<5 || N1>9)
            System.out.println("número invalido!");
        else
            System.out.println("o numero escolhido foi: " + N1);

    }
}