package Matriz;

import java.util.Scanner;

public class ExMatriz14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[4][5];
        int soma=0;

        System.out.print("Digite seus elementos: \n");
        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 5; coluna++) {
               System.out.printf("%2d | ", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }
        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 5; coluna++) {
               soma=soma+matriz[linha][coluna];
            }
        }
        System.out.print("A soma dos elementos é "+ soma);

        leia.close();
    }
}
// Ler uma matriz 4x5 de inteiros, calcular e imprimir a soma de todos os seus
//elementos.