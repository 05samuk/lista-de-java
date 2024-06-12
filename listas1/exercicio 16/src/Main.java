import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,h,volume;
        Scanner in = new Scanner(System.in);
        System.out.println("insira o raio do cone:");
        r = in.nextDouble();
        System.out.println("insira o altura do cone:");
        h = in.nextDouble();
        volume = ((Math.PI*Math.pow(r,2))*h)/3;
        System.out.println("volume =" + volume);
    }
}