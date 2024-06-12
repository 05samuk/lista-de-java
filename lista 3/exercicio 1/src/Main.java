import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int i = 1;
        int n = in.nextInt();
        System.out.println("Tabuada do " + n);
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + i * n);
            i++;

        }
    }
}