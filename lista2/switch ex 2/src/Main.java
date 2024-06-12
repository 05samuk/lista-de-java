import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n1;
        n1 = in.nextDouble();
        System.out.println("Digite um numero: ");
        double n2;
        n2 = in.nextDouble();

        System.out.println("Menu:");
        System.out.println("1 - soma.");
        System.out.println("2 - subtração.");
        System.out.println("3 - multiplicação.");
        System.out.println("4 - divisão.");

        int escolha = in.nextInt();

        double resultado = 0;

        switch (escolha){
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return; // Encerra o programa se a divisão por zero for tentada
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;

        }
        System.out.println("Resultado: " + resultado);

    }
}