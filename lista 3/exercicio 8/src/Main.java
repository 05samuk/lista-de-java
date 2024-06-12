import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("digite um numero");
        n = in.nextInt();

        if (n%2 == 0){
            System.out.println("Esse número não é primo!");

        } else {
            System.out.println("Esse número é primo");

        }
    }
}