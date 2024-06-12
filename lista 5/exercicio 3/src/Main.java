import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Resultado = " + potenciacao(recbeerX(),recbeerY()));
    }

    //FUNÇÕES AQUI:
    static int recbeerX() {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero inteiro para 'x':");
        x = in.nextInt();
        return x;
    }
    static int recbeerY() {
        Scanner in = new Scanner(System.in);
        int y;
        do {
            System.out.println("Digite um numero inteiro >= 0 para 'y':");
            y = in.nextInt();
        } while (y < 0);
        return y;
    }

    static long potenciacao(int x, int y){ //--> 'Long' para resultados enormes
        long resultado = 1; //--> Inicializa o resultado como 1
        for (int i = 0; i < y; i++) { //--> Potência
            resultado *= x; //--> Multiplica o resultado pela base 'X'
        }
        return resultado;
    }
}