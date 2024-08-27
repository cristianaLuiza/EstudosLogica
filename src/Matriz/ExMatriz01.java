package Matriz;

import java.util.Scanner;

public class ExMatriz01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        //entrada de elementos
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leia.nextInt();
            }
        }

        //montagem da matriz
        for (int linha = 0; linha < matriz.length; linha++){ //for para ler linha, legth para a quantidade de elementos da matriz
            for (int coluna=0; coluna<matriz[0].length;coluna++){ // for para ler coluna
                System.out.printf( "%2d | ",matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }
        // impressão da diagonal principal
        // A diagonal principal é acessada pelos índices [i][i], onde i é o índice tanto da linha quanto da coluna.
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        leia.close();
    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 3 x 3 e escreva os
//elementos da diagonal principal.