package matriz;

import java.util.Scanner;

public class ExMatriz04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int soma = 0;
        System.out.print("Digite seus numeros para matriz 3x3: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.printf("%2d | ", matriz[linha][coluna]);
            }
        }
        System.out.printf("%n");
        System.out.print("\"Soma dos elementos ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha < coluna) {
                    soma = soma + matriz[linha][coluna];
                    System.out.print(matriz[linha][coluna] + ", ");
                }
            }
        }
        System.out.print(" que estão acima da diagonal principal é de " + soma);


    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e imprima a
//soma dos elementos que estão acima da diagonal principal: