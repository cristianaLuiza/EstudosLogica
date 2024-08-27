package Matriz;

import java.util.Scanner;

public class ExMatrizVideo3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int contadorpar = 0, contadorimpar = 0;

        System.out.print("Digite os numeros para a matriz 3x3: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leia.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%2d | ", matriz[i][j]);
            }
            System.out.printf("%n");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    contadorpar++;

                }
                else {
                    contadorimpar++;

                }
            }
        }
        System.out.print("A quantidade de pares: " + contadorpar);
        System.out.print("\nA quantidade de impares: " + contadorimpar);

    }
}
