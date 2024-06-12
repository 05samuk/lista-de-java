import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciar personagens
        System.out.print("Digite o nome do primeiro personagem: ");
        String nome1 = scanner.nextLine();
        Personagem personagem1 = new Personagem(nome1);

        System.out.print("Digite o nome do segundo personagem: ");
        String nome2 = scanner.nextLine();
        Personagem personagem2 = new Personagem(nome2);

        System.out.println("Luta entre " + personagem1.getNome() + " e " + personagem2.getNome());

        // Alternar ataques até que a vida de um dos personagens chegue a zero
        while (personagem1.estaVivo() && personagem2.estaVivo()) {
            personagem1.ataque(personagem2);
            if (!personagem2.estaVivo()) {
                System.out.println(personagem2.getNome() + " foi derrotado!");
                break;
            }

            personagem2.ataque(personagem1);
            if (!personagem1.estaVivo()) {
                System.out.println(personagem1.getNome() + " foi derrotado!");
                break;
            }
        }

        scanner.close();
    }
}