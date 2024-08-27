package matriz;

import java.util.Scanner;

public class ExMatriz13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz1[][] = new int[2][2], matriz2[][] = new int[2][2];
        int diferenca[][] = new int[2][2];
        int i, j;

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

        // Entrada de valores para a segunda matriz
        System.out.print("\nDigite os elementos da segunda matriz \n");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matriz2[i][j]= leia.nextInt();
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("%d | ", matriz2[i][j]);
            }
            System.out.printf("%n");
        }

        // Calcular matriz diferença
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                diferenca[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        // Imprimir matriz diferença
        System.out.println("\nMatriz Diferença:\n");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("%d | ", diferenca[i][j]);
            }
            System.out.print("\n");
        }

    }


}


// Entrar com valores para duas matrizes inteiras de ordem cinco. Gerar e imprimir a
//matriz diferença.
