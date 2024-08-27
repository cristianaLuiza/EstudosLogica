package Matriz;

import java.security.SecureRandom;

public class ExMatriz24 {
    public static void main(String[] args) {
        int linha = 10;
        int coluna = 10;
        int m[][] = new int[10][10];

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
        //segunda pela oitava linha

        for (int j = 0; j < coluna; j++) {
            int aux = m[7][j];
            m[7][j] = m[1][j];
            m[1][j] = aux;

        }
        //quarta pela decima coluna
        for (int i = 0; i < linha; i++) {
            int aux = m[i][9];
            m[i][9] = m[i][3];
            m[i][3] = aux;

        }
        for (int i = 0; i < linha; i++) {
            int aux =m[i][9 - i];
            m[i][9 - i] = m[i][i];
            m[i][i] = aux;
        }

        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.printf("%2d | ", m[i][j]);
            }
            System.out.printf("%n");
        }

    }
}

//Criar um algoritmo que leia e armazene os elementos de uma matriz inteira M10x10 e
//imprimi-la. Troque, na ordem a seguir:
//- a segunda linha pela oitava linha;
//- a quarta coluna pela décima coluna;
//- a diagonal principal pela diagonal secundária.