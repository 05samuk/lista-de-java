import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v0,a,t,vf;
        Scanner in = new Scanner(System.in);
        System.out.println("insira a velocidade inicial:");
        v0 = in.nextDouble();
        System.out.println("insira a aceleração:");
        a = in.nextDouble();
        System.out.println("insira o tempo:");
        t = in.nextDouble();
        vf = v0 + a * t;

        System.out.println("velocidade final =" + vf);
    }

    }
