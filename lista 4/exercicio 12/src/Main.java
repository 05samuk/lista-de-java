public class Main
{
    public static void main(String[] args) {
        // Declarando e inicializando a matriz 3x3
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Exibindo a matriz
        System.out.println("Matriz:");
        exibirMatriz(matriz);

        // Calculando e exibindo a determinante
        int determinante = calcularDeterminante(matriz);
        System.out.println("\nDeterminante da matriz: " + determinante);
    }

    // Função para calcular a determinante de uma matriz 3x3
    public static int calcularDeterminante(int[][] matriz) {
        int det = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        return det;
    }

    // Função para exibir a matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}