import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b ,c, delta, x1, x2;
        System.out.println("digite o coeficiente a");
        a=in.nextDouble();
        System.out.println("digite o coeficiente b");
        b=in.nextDouble();
        System.out.println("digite o coeficiente c");
        c=in.nextDouble();
        delta = (Math.pow(b,2))-4*a*c;


        if (delta > 0) {
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);

            System.out.println("A solução dessa eqação é: " + x1 + "e x2 = " + x2 );

        } else if (delta == 0) {
          double x = (-b)/(2*a);
            System.out.println("A solção da equação é: " +x);

        } else {
            System.out.println("não possui solução real.");
        }
    }
}