import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int N1 = in.nextInt();

        if (N1 % 2 == 0)
            System.out.println("esse numero é par.");
        else
            System.out.println("esse numero é impar");
    }
}