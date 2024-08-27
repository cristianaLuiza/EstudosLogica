package Matriz;

import java.util.Scanner;

public class ExMatriz06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][]=new int[3][3];
        int produto=1;

        System.out.print("Dugite os elementos da matriz 3x3: ");
        for(int linha=0; linha< matriz.length;linha++){
            for(int coluna=0; coluna< matriz.length; coluna++){
                matriz[linha][coluna]=leia.nextInt();
            }
        }
        for (int linha =0; linha< matriz.length; linha++){
            for(int coluna=0;coluna< matriz.length; coluna++){
                System.out.printf("%2d | ", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }
        System.out.print("O produto dos elementos ");
        for(int linha=0;linha<matriz.length;linha++){
            for(int coluna=0;coluna< matriz.length;coluna++){
                if(linha>coluna){
                    System.out.print(matriz[linha][coluna]+", ");

                    produto= produto * matriz[linha][coluna];

                }
            }
        }
        System.out.print(" é "+ produto);

    }
}
//Criar um algoritmo que leia os elementos de uma matriz inteira 3 x 3 e imprima o
//produto dos elementos que estão abaixo da diagonal principal.