import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  menor, meio, maior, aux;
        System.out.println("digite 3 numeros inteiros");
        menor= in.nextInt();
        meio= in.nextInt();
        maior= in.nextInt();


        if (maior<menor){
            aux = menor;
            menor=maior;
            maior = aux;
        }
        if (maior<meio){
            aux=meio;
            meio=maior;
            maior=aux;
        }
        if (meio<menor) {
            aux = menor;
            menor = meio;
            meio = aux;
        }
        System.out.println(menor +" "+ meio +" "+ maior);
    }
}