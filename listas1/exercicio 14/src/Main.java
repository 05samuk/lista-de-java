import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner in = new Scanner(System.in);
        System.out.println("insira a base:");
        base = in.nextDouble();
        System.out.println("insira a altura:");
        altura = in.nextDouble();
        area = (base*altura) / 2;

    }
}