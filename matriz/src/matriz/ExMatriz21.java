package matriz;

import java.security.SecureRandom;

public class ExMatriz21 {
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
        int m2[][] = new int[coluna][linha];
        int linha_matriz_rotacionada = linha-1;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {//incremento meu J
                m2[j][linha_matriz_rotacionada] = m[i][j];
            }
            linha_matriz_rotacionada--; //decremento minha linha depois do for do J para percorrer novamente a proxima coluna
        }

        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.printf("%2d | ", m2[i][j]);
            }
            System.out.printf("%n");
        }

    }
}
