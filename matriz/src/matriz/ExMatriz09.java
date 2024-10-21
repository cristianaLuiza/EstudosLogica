package matriz;

import aula2.Caneta;

import java.util.Scanner;

public class ExMatriz09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.print("Digite seu digitos para matriz 3x3: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.printf("%2d | ", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }


        System.out.print("Os elementos acima da diagonal 2º são ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (j<3-i && i+j!=2) {
                    System.out.print(matriz[i][j] + ", ");
                }
        }

        leia.close();


    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e escreva
//somente os elementos acima da diagonal secundária.
