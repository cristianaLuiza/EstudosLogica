package matriz;

import java.security.SecureRandom;

public class ExMatriz25 {
    public static void main(String[] args) {
        int linha = 2;
        int coluna = 2;
        int m[][] = new int[2][2];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                m[i][j] = new SecureRandom().nextInt(4);
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%2d | ", m[i][j]);
            }
            System.out.printf("%n");
        }
        int somaP = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j) {
                    somaP = somaP + m[i][j];
                }
            }
        }
        int somaS = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i != j) {
                    somaS = somaS + m[i][j];
                }
            }
        }
        int produto = 0;
        produto = somaS * somaP;


        System.out.print("A soma da diagonal principal " + somaP);
        System.out.print("\nA soma da diagonal secundaria " + somaS);
        System.out.print("\nO produto das diagonais " + produto);


    }
}
//Criar um algoritmo que leia valores para uma matriz M2x2. Calcular e imprimir o
//determinante. Para cálculo do determinante de uma matriz de ordem 2, é simplesmente
//computar a diferença entre os produtos das diagonais principal e secundária,
//respectivamente.