import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,h,volume;
        Scanner in = new Scanner(System.in);
        System.out.println("insira o raio do cilindro:");
        r = in.nextDouble();
        System.out.println("insira o altura do cilindro:");
        h = in.nextDouble();
        volume = ((Math.PI*Math.pow(r,2))*h);
        System.out.println("volume =" + volume);

    }
}