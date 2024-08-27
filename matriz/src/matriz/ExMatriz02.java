package matriz;

import java.util.Scanner;

public class ExMatriz02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.printf("%2d | ", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }

        System.out.println("Elementos não diagonais :");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(coluna!=linha){
                    System.out.print(matriz[linha][coluna]+", ");
                }
            }

        }

        leia.close();

    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 3 x 3 e escreva
//todos os elementos, exceto os elementos da diagonal principal.