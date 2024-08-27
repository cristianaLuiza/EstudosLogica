package matriz;

import java.security.SecureRandom;

public class ExMatriz26 {
    public static void main(String[] args) {
        int linha = 3;
        int coluna = 3;
        int m[][] = new int[3][3];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%2d | ", m[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.print("\n\n");
        int mt[][] = new int[3][3];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mt[j][i] = m[i][j];
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%2d | ", mt[i][j]);
            }
            System.out.printf("%n");
        }


    }
}
//Criar um algoritmo que leia uma matriz ANxN (N ≤ 10) e calcule a respectiva matriz
//transposta At