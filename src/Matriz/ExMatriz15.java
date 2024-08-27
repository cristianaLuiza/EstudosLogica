package Matriz;

import java.util.Scanner;

public class ExMatriz15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz1[][] = new int[2][2];
        int diferenca[][] = new int[2][2];
        int i, j, soma=0;

        // Entrada de valores para a primeira matriz
        System.out.print("Digite os elementos da primeira matriz\n");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matriz1[i][j]= leia.nextInt();
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("%d | ", matriz1[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
//Ler valores inteiros para a matriz A3x5. Gerar e imprimir a matriz (vetor) SL (soma das
//3 linhas), onde cada elemento é a soma dos elementos de uma linha da matriz A. Faça
//o trecho que gera a matriz SL separado (laços de repetição) da entrada e da saída de
//dados.