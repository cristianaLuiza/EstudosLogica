package Matriz;

import java.util.Scanner;

public class ExMatriz03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.print("Digite os números de sua matriz 3x3: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.printf("%2d |", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }
        System.out.print("Os elementos acima da diagonal principal são os numeros ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha < coluna) {
                    System.out.print(matriz[linha][coluna] + ", ");
                }

            }
        }


    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 3 x 3 e escreva
//somente os elementos acima da diagonal principal.