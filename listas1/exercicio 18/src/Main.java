import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, x;
        System.out.println("digite o coeficiente a");
        a=in.nextInt();
        System.out.println("digite o coeficiente b");
        b=in.nextInt();
        x = -b/a;
        System.out.println(a+"x +(" + b + ") =0, então x é igual " + x);
    }
}