package Matriz;

import java.util.Scanner;

public class ExMatriz12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matrizA[][] = new int[2][2];
        int matrizB[][] = new int[2][2];
        int somaA = 0, somaB = 0, soma_total = 0;

        System.out.println("Digite os elementos da matriz A");
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
                matrizA[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
                System.out.printf("%2d | ", matrizA[linha][coluna]);
            }
            System.out.printf("%n");
        }
        System.out.println("Digite os elementos da matriz B");
        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[0].length; coluna++) {
                matrizB[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[0].length; coluna++) {
                System.out.printf("%2d | ", matrizB[linha][coluna]);
            }
            System.out.printf("%n");
        }
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
                somaA = somaA + matrizA[linha][coluna];
            }
        }
        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[0].length; coluna++) {
                somaB = somaB + matrizB[linha][coluna];
            }
        }
        soma_total=somaA+somaB;
        System.out.print("A soma de todos os elementos das duas matrizes é de "+soma_total);

    }
}
// Entrar com valores inteiros para um matriz A4x4 e para uma matriz B4x4. Gerar e
//imprimir a SOMA (A+B).