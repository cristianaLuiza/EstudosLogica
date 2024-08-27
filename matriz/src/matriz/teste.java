package matriz;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];


        // Entrada dos elementos da matriz
        System.out.println("Digite os elementos da matriz 10x10:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impressão da diagonal principal
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 2; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        scanner.close();
    }
}
