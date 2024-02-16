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
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);

        System.out.println(a+"x² +(" + b + ")x + ("+c+") = 0, \n então \n x1= "+1+" e x2= "+x2);
    }
}