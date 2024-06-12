import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("insira um numero de 1 a 7 para os dias da semana.");
        int numero;
        numero = in.nextInt();


        switch (numero){
            case  1:
                System.out.println("domingo");
                break;
            case  2:
                System.out.println("segunda");
                break;
            case  3:
                System.out.println("terça");
                break;
            case  4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("nuemro inválido!");
                break;
        }

    }
}