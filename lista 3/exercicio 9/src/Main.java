import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo da Tabuada!");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int resultadoEsperado = i * j;
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != resultadoEsperado) {
                        System.out.println("Resposta incorreta! Você perdeu.");
                        jogarNovamente = perguntarJogarNovamente(scanner);
                        break;
                    }
                }
            }

            if (jogarNovamente) {
                System.out.println("Parabéns! Você completou toda a tabuada sem erros!");
                jogarNovamente = perguntarJogarNovamente(scanner);
            }
        }
        scanner.close();
    }

    private static boolean perguntarJogarNovamente(Scanner scanner) {
        System.out.println("Deseja jogar novamente? (s/n)");
        String resposta = scanner.next().toLowerCase();
        return resposta.equals("s");
    }
}