package Matriz;

import java.util.Random;

public class ExMatrizVideo2 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        Random numeroRandom = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maiorL = 0;
        int menorL = 100;
        int linha = 0;
        int coluna = 0;
        int maiorC = 0;
        int menorC = 100;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d | ", matriz[i][j]);
            }
            System.out.printf("%n");
        }
        for (int i = 0; i < matriz[linha].length; i++) {

            if (matriz[5][i] > maiorL) {
                maiorL = matriz[5][i];
            }
            if (matriz[5][i] < menorL) {
                menorL = matriz[5][i];
            }
        }
        for (int j = 0; j < matriz[coluna].length; j++) {
            if (matriz[j][7] > maiorC) {
                maiorC = matriz[j][7];
            }
            if (matriz[j][7] < menorC) {
                menorC = matriz[j][7];
            }
        }

        System.out.print("O Maior numero da linha 5 é o "+maiorL+" e o menor "+menorL);
        System.out.print("\nO Maior numero da coluna 7 é o "+maiorC+" e o menor "+menorC);

        }
}
