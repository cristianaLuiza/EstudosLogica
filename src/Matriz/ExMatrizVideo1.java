package Matriz;


import java.util.Random;

public class ExMatrizVideo1 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.printf("%2d | ", numerosAleatorios[i][j]);
            }
            System.out.printf("%n");
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("\nMaior valor = " + maior);
        System.out.println("linha = " + linha);
        System.out.println("coluna = " + coluna);

    }
}

