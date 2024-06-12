import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(palindromo(receber()));

    }
    //FUNÇÕES AQUI:
    static String receber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = in.nextLine();
        return palavra;
    }

    static boolean palindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase();  //--> Remove os espaços em branco e converter para minúsculas

//--> Percorrer a String da esquerda para a direita e da direita para a esquerda: <--
        for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {

            if (palavra.charAt(j) != palavra.charAt(i)) {  // 'charAt:  retorna o caractere localizado no índice especificado da string.
                return false;
            }
        }

        return true;
    }
}