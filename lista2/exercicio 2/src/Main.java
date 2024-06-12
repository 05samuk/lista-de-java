import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("digite um número: ");
        a = in.nextInt();
        System.out.println("digite outro número: ");
        b = in.nextInt();

        if (a>b)
        System.out.println("o número " + a + " é maior");

        else {
            System.out.println("o número " + b + " é maior");


        }




    }
}