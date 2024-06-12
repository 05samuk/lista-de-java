import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota N1");
        n1 = in.nextDouble();
        System.out.println("digite a nota N2");
        n2 = in.nextDouble();

        media= (n1*1 + n2*2)/3;
        System.out.println("media = " + media);

    }
}