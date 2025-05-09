package matriz;

import java.security.SecureRandom;
import java.util.Scanner;

public class ExMatriz28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        boolean simetrica = false;
        int linha;
        int coluna;

        System.out.print("Digite o numero de linhas de sua matriz: ");
        linha = leia.nextInt();
        System.out.print("Digite o numero de coluna de sua matriz: ");
        coluna = leia.nextInt();
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

        int nlinha = coluna;
        int ncoluna = linha;
        int mt[][] = new int[nlinha][ncoluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mt[j][i] = m[i][j];
            }
        }
        for (int i = 0; i < nlinha; i++) {
            for (int j = 0; j < ncoluna; j++) {
                System.out.printf("%2d | ", mt[i][j]);
            }
            System.out.printf("%n");
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (mt[j][i] == m[i][j]) {
                    simetrica = true;

                } else {
                    simetrica = false;

                }
            }
        }
        if (simetrica) {
            System.out.print("\nAs matrizes são simetricas");
        } else {
            System.out.print("\nAs matrizes não são simetricas");
        }

    }
}
//) Criar um algoritmo que leia uma matriz ANxN (N ≤ 10) e verifique (informe) se tal
//matriz é ou não anti-simétrica (At = -A).
//