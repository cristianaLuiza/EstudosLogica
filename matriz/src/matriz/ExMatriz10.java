package matriz;


import java.security.SecureRandom;

public class ExMatriz10 {
    public static void main(String[] args) {

        final int linhas = 3;
        final int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%2d | ", matriz[l][c]);
            }
            System.out.printf("%n");
        }

        System.out.print("Os elementos abaixo da diagonal 2º são ");
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (l + c != 2 && l > 3 - c || l==3-c) {
                    System.out.print(matriz[l][c] + ", ");
                }
            }
        }

    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e escreva
//somente os elementos abaixo da diagonal secundária.