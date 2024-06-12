import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("escreva o lado A");
        int A, B, C;
        A = in.nextInt();
        System.out.println("escreva o lado B");
        B = in.nextInt();
        System.out.println("escreva o lado C");
        C = in.nextInt();




        if (A<B+C && A>Math.abs(B-C) &&
            B<A+C && B>Math.abs(A-C) &&
            C<B+A && C>Math.abs(B-A)){
            if (A==B && A==C)
            System.out.println("triangulo equilatero");
            else if (A==B || A==C || B==C )
                System.out.println("triangulo isosceles");
            else
                System.out.println("triangulo escaleno");
        }else {
            System.out.println("Os valores digitados não formam um triangulo!");
        }

    }

}