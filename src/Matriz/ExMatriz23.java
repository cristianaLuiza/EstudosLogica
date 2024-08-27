package Matriz;

import java.security.SecureRandom;

public class ExMatriz23 {
    public static void main(String[] args) {

        int linha = 3;
        int coluna = 3;
        int m[][] = new int[linha][coluna];

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
        int m2[][] = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            int lmi=linha-1;
            for (int j = 0; j < coluna; j++) {
                m2[lmi][i]=m[i][j];
                lmi--;
            }
        }

        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.printf("%2d | ", m2[i][j]);
            }
            System.out.printf("%n");
        }


    }
}