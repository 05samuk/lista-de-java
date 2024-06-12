public class Main {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(buscaBinaria(array, 7));

    }

    //FUNÇÕES AQUI:
    static int buscaBinaria(int[] array, int elemento) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }

}