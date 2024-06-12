import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo retangulo");
        System.out.println("3. Retangulo");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                calcularCirculo();
                break;
            case 2:
                calcularTrianguloRetangulo();
                break;
            case 3:
                calcularRetangulo();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void calcularCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        exibirResultados(area, perimetro);
    }

    private static void calcularTrianguloRetangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo retângulo:");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro = base + altura + hipotenusa;

        exibirResultados(area, perimetro);
    }

    private static void calcularRetangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double perimetro = 2 * (comprimento + largura);

        exibirResultados(area, perimetro);
    }

    private static void exibirResultados(double area, double perimetro) {
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

