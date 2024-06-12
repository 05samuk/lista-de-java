import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Vendas");
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");

        int escolhaPagamento = scanner.nextInt();

        switch (escolhaPagamento) {
            case 1:
                calcularTotalPagarDebito(valorCompra);
                break;
            case 2:
                calcularTotalPagarCredito(valorCompra);
                break;
            case 3:
                calcularTotalPagarPix(valorCompra);
                break;
            default:
                System.out.println("Opção de pagamento inválida");
        }
    }

    private static void calcularTotalPagarDebito(double valorCompra) {
        double descontoDebito = valorCompra * 0.05;
        double totalPagar = valorCompra - descontoDebito;
        System.out.println("Total a pagar (Débito): " + totalPagar);
    }

    private static void calcularTotalPagarCredito(double valorCompra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de parcelas (até 4 vezes):");
        int numeroParcelas = scanner.nextInt();

        double totalPagar;

        if (numeroParcelas <= 4) {
            double taxaParcelamento = valorCompra * 0.02;
            totalPagar = valorCompra + taxaParcelamento;
        } else {
            double taxaParcelamento = valorCompra * 0.05;
            totalPagar = valorCompra + taxaParcelamento;
        }

        System.out.println("Total a pagar (Crédito): " + totalPagar);
    }

    private static void calcularTotalPagarPix(double valorCompra) {
        double descontoPix = valorCompra * 0.10;
        double totalPagar = valorCompra - descontoPix;
        System.out.println("Total a pagar (Pix): " + totalPagar);
    }
}