package Matriz;

import java.security.SecureRandom;

public class ExMatriz11 {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 4;
        final int linhasB=3*linhas;
        final int colunasB=3*colunas;
        int[][] matriz = new int[linhas][colunas];
        int[][] matrizB = new int[linhasB][colunasB];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = new SecureRandom().nextInt(9);
            }
        }
        System.out.print("Matriz A \n");
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {

                System.out.printf("%2d | ", matriz[l][c]);
            }
            System.out.printf("%n");
        }
        System.out.print("Matriz B \n");
        for (int l = 0; l < linhasB; l++) {
            for (int c = 0; c < colunasB; c++) {
                matrizB[l][c] = new SecureRandom().nextInt(9);

                System.out.printf("%2d | ", matrizB[l][c]);
            }
            System.out.printf("%n");
        }

    }
}
//Entrar com valores para uma matriz A3x4. Gerar e imprimir uma matriz B que é o
//triplo da matriz A.